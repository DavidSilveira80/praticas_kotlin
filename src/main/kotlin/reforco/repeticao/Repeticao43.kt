package reforco.repeticao

/*
Crie um programa que simule um contador regressivo para o lançamento de um foguete.
O usuário deve informar o número inicial do contador, e o programa deve exibir os
números decrescentes até chegar a zero, quando então será exibida a mensagem
"Lançamento realizado!".

Passo a passo:

Solicite ao usuário que insira o número inicial do contador.
Use uma estrutura while para decrementar o número até que ele chegue a zero.
A cada iteração, exiba o valor atual do contador.
Quando o contador chegar a zero, exiba a mensagem "Lançamento realizado!".


 */

fun main(){
    var numeroInicial = 10

    while(numeroInicial >= 0){
        if(numeroInicial == 0){
            println(numeroInicial)
            println("LANÇAMENTO REALIZADO!!!")
        }else{
            println(numeroInicial)
        }
        numeroInicial --
    }
}
