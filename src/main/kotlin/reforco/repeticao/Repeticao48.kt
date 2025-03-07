package reforco.repeticao

/*
Desenvolva um programa que exiba todos os números de 1 a 20, exceto os múltiplos de 3.

Passo a passo:

Use uma estrutura de repetição (for ou while) para iterar de 1 a 20.
Dentro do loop, verifique se o número atual é múltiplo de 3 (usando o operador de módulo %).
Se o número for múltiplo de 3, use a instrução continue para pular para a próxima iteração.
Caso contrário, exiba o número na tela.
Continue o loop até que todos os números no intervalo sejam verificados.
 */

fun main(){
    for(i in 1..20){
        if(i % 3 == 0){
            continue
        }else{
            println(i)
        }
    }
}
