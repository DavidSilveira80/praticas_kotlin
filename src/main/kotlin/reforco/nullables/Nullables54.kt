package reforco.nullables

/*
Implemente uma função chamada exibirTamanhoNome que recebe um nome do tipo String? e imprime o tamanho
do nome apenas se ele não for nulo. Use safe calls para evitar acessar propriedades de um valor nulo.

Passo a passo:

Declare uma função chamada exibirTamanhoNome que recebe um parâmetro nome: String?.
Use o operador de safe call (?.) para acessar a propriedade length do nome.
Imprima o tamanho do nome se ele não for nulo.
Se o nome for nulo, imprima uma mensagem informando que o nome é inválido.
Teste a função com diferentes valores, incluindo null.
 */

fun exibirTamanhoNome(nome: String?){
    if(nome != null){
        println(nome?.length)
    }else{
        println("Nome inválido.")
    }
}

fun main(){
    exibirTamanhoNome("David")
}
