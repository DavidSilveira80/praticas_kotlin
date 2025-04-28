package nichos.veterinario

// Como recepcionista, quero registrar os dados básicos de um animal para manter o
// cadastro atualizado.


data class Pet(val nome: String, val especie: String, var idade: Int)

fun menu(): String{
    val opcoes = setOf("1", "2", "3")
    var opcao : String
    do{
        println("""
                *****************************
                     1- Cadastrar Animal
                     2- Listar Animais        
                     3- Sair                  
                *****************************
                """.trimIndent())
        print("_> ")
        opcao = readlnOrNull().orEmpty()
        if(opcao !in opcoes) println("Opção inválida")
    }while(opcao !in opcoes)
    return opcao
}

fun cadastrarAnimal(): Pet{
    print("Informe o nome do animal: ")
    val nome = readln()
    print("Informe a espécie do animal: ")
    val especie = readln()
    print("Informe a idade do animal em meses: ")
    val idadeEmMeses = readlnOrNull()?.toIntOrNull() ?: 0
    return Pet(nome, especie, idadeEmMeses)
}

fun listarAnimal(pets: List<Pet>){
    pets.forEach { println("Nome: ${it.nome} Espécie: ${it.especie} Idade: ${it.idade} meses.") }
}

fun main() {
    val pets = mutableListOf<Pet>()

    while (true) {
        when (menu()) {
            "1" -> {
                println("Cadastrar")
                pets.add(cadastrarAnimal())
            }

            "2" -> {
                println("Listar")
                listarAnimal(pets)
            }

            "3" -> {
                println("Sair")
                break
            }
        }
    }
}
