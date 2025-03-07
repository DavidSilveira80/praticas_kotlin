package reforco.decisao

/*

Desenvolva um programa que receba um número de 1 a 7 e imprima o dia da semana correspondente (1 = Domingo, 2 = Segunda-feira, etc.).

Passo a passo:

Solicite ao usuário que insira um número de 1 a 7.
Armazene o número em uma variável.
Use a estrutura when para verificar o valor do número:
Caso o número seja 1, imprima "Domingo".
Caso o número seja 2, imprima "Segunda-feira".
Repita para os outros dias da semana.
Para qualquer outro valor, imprima "Número inválido".

 */

fun main(){
    // Número de 1 a 7
    val numero = 18

    when(numero){
        1 -> println("Domingo")
        2 -> println("Segunda-feira")
        3 -> println("Terça-feira")
        4 -> println("Quarta-feira")
        5 -> println("Quinta-feira")
        6 -> println("Sexta-feira")
        7 -> println("Sábado")
        else -> println("Número Inválido.")
    }
}
