package reforco.funcoes

/*
Crie uma função chamada multiplicar que recebe dois números inteiros como parâmetros e retorna o
produto deles.

Passo a passo:

Declare uma função chamada multiplicar.
Adicione dois parâmetros: numero1 e numero2, ambos do tipo Int.
Especifique o tipo de retorno da função como Int.
No corpo da função, calcule o produto dos dois números e retorne o resultado usando a palavra-chave return.
Chame a função com diferentes valores para os parâmetros e armazene o resultado em uma variável para
verificar o funcionamento.
 */

fun multiplicar(numero1 : Int, numero2 : Int): Int{
    return numero1 * numero2
}

fun main(){
    val multiplicacao = multiplicar(3, 2)
    println(multiplicacao)
}
