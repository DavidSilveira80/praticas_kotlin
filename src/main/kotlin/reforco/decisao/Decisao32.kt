package reforco.decisao

/*
Enunciado:
Crie um programa que receba a idade de uma pessoa e imprima "Você é maior de idade" se
a idade for maior ou igual a 18.

Passo a passo:

Solicite ao usuário que insira sua idade.
Armazene o valor da idade em uma variável.
Use a estrutura if para verificar se a idade é maior ou igual a 18.
Se a condição for verdadeira, imprima a mensagem "Você é maior de idade".
Não é necessário tratar o caso contrário.

 */

fun main(){
    val idade = 18

    if(idade >= 18){
        println("Você é maior de idade.")
    }
}