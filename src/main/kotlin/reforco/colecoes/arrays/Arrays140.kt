package reforco.colecoes.arrays

/*
Crie um array que permita valores nulos (null) e um array de tipo primitivo (IntArray). Adicione
dois valores nulos ao primeiro array e converta-o para um IntArray, tratando os valores nulos.
Passo a passo:

Declare um array de tipo IntArray com valores não nulos .
Crie um array de tipo Array<Int?> para permitir valores nulos .
Adicione dois valores nulos ao array Array<Int?> .
Converta o array Array<Int?> para IntArray, substituindo valores nulos por 0
 */


fun main(){
    val inteiros: IntArray
    val inteirosENulos: Array<Int?> = arrayOf(3, 5, 2, null, 10, 20, null, 18, 70)
    inteiros = inteirosENulos.map { it ?: 0 }.toIntArray()
    println(inteiros.contentToString())
}
