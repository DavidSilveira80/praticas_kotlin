package reforco.classesobjetos

/*
Descrição: O exercício foca em adicionar comportamentos à classe por meio da criação de
métodos. Você aprenderá a definir funções que executem tarefas específicas dentro de uma classe.
Tarefas:

Declarar uma classe contendo um ou mais métodos.
Definir métodos que realizem ações simples (como exibir uma mensagem).
Instanciar a classe e chamar os métodos criados.
Passos:
Crie uma classe com um método que execute uma ação simples.
Instancie a classe.
Chame o método através do objeto criado.
Observe os resultados para confirmar a execução correta do método.
 */

class Pessoa{
    fun cumprimento(){
        println("Olá, Eu sou um Instância de uma Pessoa, que usa o método cumprimento.")
    }
}

fun main(){

    val pessoa = Pessoa()
    pessoa.cumprimento()
}
