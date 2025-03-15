package reforco.nullables

/*
Crie uma função chamada processarNumero que recebe um número do tipo Int? e verifica se ele é maior que 10.
 Use smart cast para garantir que o número não seja nulo antes de realizar a comparação.

Passo a passo:

Declare uma função chamada processarNumero que recebe um parâmetro numero: Int?.
Use uma estrutura condicional (if) para verificar se o número não é nulo.
Dentro da condição, utilize o smart cast para tratar o número como Int e verificar se ele é maior que 10.
Se o número for maior que 10, imprima "Número maior que 10".
Caso contrário, imprima "Número menor ou igual a 10".
Teste a função com valores nulos e não nulos.
 */

fun processarNumero(numero: Int?){
    if(numero != null){
        if(numero > 10){
            println("Número maior que 10.")
        }else{
            println("Número menor ou igual a 10.")
        }
    }else{
        println("Valor Nulo.")
    }
}

fun main(){
    processarNumero(10)
    processarNumero(34)
    processarNumero(4)
    processarNumero(null)
}
