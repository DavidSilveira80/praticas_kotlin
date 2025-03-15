package reforco.funcoes

/*
68. Os tipos de retorno Unit e Nothing
Enunciado:
Crie duas funções: mostrarMensagem e lancaErro. A primeira função deve ter o tipo de retorno Unit e
imprimir uma mensagem no console. A segunda função deve ter o tipo de retorno Nothing e lançar uma exceção.

Passo a passo:

Declare uma função chamada mostrarMensagem.
Não especifique explicitamente o tipo de retorno (ele será Unit por padrão).
No corpo da função, use println para exibir uma mensagem qualquer.
Declare uma função chamada lancaErro.
Especifique o tipo de retorno como Nothing.
No corpo da função, lance uma exceção usando throw Exception("Erro!").
Chame ambas as funções para observar seus comportamentos.
 */

fun mostrarMensagem(): Unit{
    println("Mostrando mensagem!")
}

fun lancaErro(): Nothing{
    throw Exception("ERRO!")
}


fun main(){
    println(mostrarMensagem())
    lancaErro()
}
