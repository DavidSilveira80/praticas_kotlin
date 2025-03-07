package reforco.decisao

/*
Crie um programa que receba um número inteiro e retorne uma mensagem de acordo com o
seguinte critério:

Números menores que 0: "Negativo".
Número igual a 0: "Zero".
Números maiores que 0: "Positivo".
Passo a passo:

Solicite ao usuário que insira um número.
Armazene o número em uma variável.
Use when como uma expressão para retornar a mensagem correspondente ao número:
Se o número for menor que 0, retorne "Negativo".
Se o número for igual a 0, retorne "Zero".
Se o número for maior que 0, retorne "Positivo".
Atribua o resultado da expressão a uma variável.
Imprima o valor da variável que contém a mensagem.

 */


fun main() {

    val numero = 0

    val resposta = when {
        numero < 0 -> "NEGATIVO"
        numero > 0 -> "POSITIVO"
        else -> "ZERO"
    }

    println(resposta)
}
