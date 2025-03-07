package reforco.decisao

/*
Crie um programa que determine se um número fornecido pelo usuário é par ou ímpar.

Passo a passo:

Solicite ao usuário que insira um número.
Armazene o número em uma variável.
Use a estrutura if..else para verificar se o número é divisível por 2 (ou seja, o resto da
divisão por 2 é zero).
Se a condição for verdadeira, imprima "O número é par".
Caso contrário, imprima "O número é ímpar".

*/

fun main(){
    val numero = 12

    if(numero % 2 == 0){
        println("Número PAR.")
    }else{
        println("Número ÍMPAR.")
    }
}
