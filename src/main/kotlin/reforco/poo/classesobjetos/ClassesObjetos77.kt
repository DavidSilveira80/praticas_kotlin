package reforco.poo.classesobjetos

/*
Descrição: Este exercício ensina como criar múltiplos construtores (construtores sobrecarregados)
 dentro de uma mesma classe, permitindo diferentes formas de instanciar objetos conforme as
 necessidades.
Tarefas:

Definir um construtor primário para a classe.
Adicionar construtores secundários com diferentes conjuntos de parâmetros.
Testar a criação de objetos utilizando cada um dos construtores disponíveis.
Passos:
Crie uma classe com um construtor primário que atenda à maioria dos casos.
Implemente construtores adicionais que possibilitem a criação de objetos com informações variadas.
Instancie a classe utilizando cada um dos construtores.
Valide que todas as instâncias foram configuradas conforme os parâmetros fornecidos.
 */


class Pessoa1(val nome: String, var idade: Int){
    init{
        println("Nome: $nome")
    }

    constructor() : this("", 0)

    constructor(nome: String) : this(nome, 0)

    constructor(idade: Int) : this("", idade)

}

fun main(){
    var pessoa1 = Pessoa1()
    var pessoa2 = Pessoa1("André")
    var pessoa3 = Pessoa1("Jorge", 50)
    var pessoa4 = Pessoa1(33)
    println(pessoa1.nome)
    println(pessoa1.idade)

    println(pessoa2.nome)
    println(pessoa2.idade)

    println(pessoa3.nome)
    println(pessoa3.idade)

    println(pessoa4.nome)
    println(pessoa4.idade)
}
