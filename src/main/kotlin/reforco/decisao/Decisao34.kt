package reforco.decisao

/*
Escreva um programa que receba um número do usuário e, se ele estiver entre 10 e 20 (inclusive),
 calcule e imprima o quadrado desse número.

Passo a passo:

Solicite ao usuário que insira um número.
Armazene o número em uma variável.
Use a estrutura if para verificar se o número está no intervalo de 10 a 20.
Se a condição for verdadeira, multiplique o número por ele mesmo e imprima o resultado.
Se a condição for falsa, não faça nada.
*/


fun main(){
    val numero = 9

    if(numero in 10..20){
        println(numero * numero)
    }
}