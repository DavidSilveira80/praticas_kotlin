package reforco.repeticao

/*
Escreva um programa que solicite ao usuário um número inteiro e imprima a tabuada desse número, de 1 a 10.

Passo a passo:

Solicite ao usuário que insira um número inteiro.
Use uma estrutura de repetição (while, for ou do..while) para calcular e exibir a multiplicação do número
informado pelos valores de 1 a 10.
Formate a saída para que cada linha mostre a operação completa (exemplo: "5 x 1 = 5").
Repita o processo até que todas as multiplicações sejam exibidas.

 */

fun main(){
    val numero = 7

    for(i in 1..10){
        println("$i X $numero = ${i * numero}")
    }
}
