package reforco.funcoes

/*
Crie uma função chamada ehPar que recebe um número inteiro como parâmetro e retorna true se o número for
par ou false caso contrário. Use a sintaxe de função como expressão.

Passo a passo:

Declare uma função chamada ehPar.
Adicione um parâmetro chamado numero do tipo Int.
Especifique o tipo de retorno da função como Boolean.
Use a sintaxe de função como expressão para retornar diretamente o resultado da condição numero % 2 == 0.
Chame a função com diferentes valores para verificar se ela identifica corretamente números pares e ímpares.
 */

fun ehPar(numero: Int): Boolean{
    return numero % 2 == 0
}


fun main(){
    if(ehPar(5)){
        println("PAR")
    }else{
        println("IMPAR")
    }
}
