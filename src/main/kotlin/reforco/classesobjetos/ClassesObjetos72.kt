package reforco.classesobjetos

/*
Descrição: Neste exercício, você irá criar uma classe simples e instanciar seu primeiro
objeto em Kotlin. O objetivo é familiarizar-se com a sintaxe básica de declaração de
classes e criação de objetos.
Tarefas:

Declarar uma classe com um nome significativo.
Criar um objeto (instância) da classe.
Exibir ou registrar uma mensagem que confirme a criação do objeto.
Passos:
Defina a classe utilizando a sintaxe básica do Kotlin.
Instancie a classe criando um objeto.
Implemente uma forma de demonstrar que o objeto foi criado, como uma mensagem no console.
Execute o programa para verificar o funcionamento.

 */

class Carro(){
    init{
        println("Instância de Carro feita com sucesso!")
    }
}


fun main(){
    val carro = Carro()
}
