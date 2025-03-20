package reforco.poo.classesobjetos

/*
Descrição: Neste exercício, você irá implementar a sobrecarga de métodos, ou seja,
criar métodos com o mesmo nome mas com assinaturas diferentes, que permitam executar comportamentos variados.
Tarefas:

Criar uma classe com um método base.
Definir versões adicionais do mesmo método, alterando a quantidade e/ou o tipo de parâmetros.
Chamar cada versão do método e analisar o resultado.
Passos:
Declare uma classe com um método inicial simples.
Implemente outras versões do método, modificando os parâmetros para que o Kotlin
                                reconheça a sobrecarga.
Instancie a classe e execute cada variação do método.
Documente o comportamento e a resposta de cada chamada.
 */

class Pessoa2(){

    fun falar(palavra: String): String{
        return "Falando a palavra: $palavra."
    }

    fun falar(numero: Int): String{
        return "Falando o número: $numero."
    }
}


fun main(){

    val pessoa = Pessoa2()

    println(pessoa.falar("Ouro")) // chamando método que retorna palavra falada
    println(pessoa.falar(7)) // chamando método sobrescrito que retorna número falado
}
