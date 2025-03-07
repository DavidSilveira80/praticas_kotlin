package reforco.repeticao

/*
Crie um programa que exiba todos os números pares entre 1 e 50.

Passo a passo:

Use uma estrutura de repetição for para iterar sobre os números de 1 a 50.
Verifique se o número atual é par (usando o operador de módulo %).
Se o número for par, exiba-o na tela.
Continue o loop até que todos os números no intervalo sejam verificados.

 */

fun main(){
    for(i in 1..50){
        if(i % 2 == 0){
            println(i)
        }
    }
}
