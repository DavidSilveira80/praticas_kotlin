                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               package reforco.colecoes.arrays

/*
Crie um array de inteiros com 5 elementos, inicialize-o com valores de 1 a 5, acesse o terceiro elemento, modifique-o para 10 e imprima o tamanho do array.
Passo a passo:

Declare um array de inteiros com capacidade para 5 elementos .
Inicialize o array com os valores 1, 2, 3, 4 e 5 .
Acesse o terceiro elemento (índice 2) e altere seu valor para 10 .
Imprima o tamanho do array para verificar se a modificação não alterou sua estrutura
 */


fun main(){
    val numeros = intArrayOf(1,2,3,4,5)
    println(numeros.size)
    numeros[2] = 10
    println(numeros.size)
}
