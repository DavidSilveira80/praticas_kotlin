package reforco.decisao

/*
Enunciado:
Desenvolva um programa que verifique se um número fornecido pelo usuário é positivo ou negativo.

Passo a passo:

Solicite ao usuário que insira um número.
Armazene o número em uma variável.
Use a estrutura if..else para verificar se o número é maior ou igual a zero.
Se a condição for verdadeira, imprima "O número é positivo".
Caso contrário, imprima "O número é negativo".
 */

fun main(){
    val numero = -9

    if(numero >= 0){
        println("O número é positivo")
    }else{
        println("O número é neqativo.")
    }
}