package reforco.funcoes

/*
Crie uma função chamada saudacaoPersonalizada que recebe um parâmetro nome do tipo String e outro
parâmetro saudacao com valor padrão "Olá". A função deve imprimir "[saudacao], [nome]!".

Passo a passo:

Declare uma função chamada saudacaoPersonalizada.
Adicione dois parâmetros: nome do tipo String e saudacao do tipo String com valor padrão "Olá".
No corpo da função, use println para exibir a mensagem formatada com os valores dos parâmetros.
Chame a função sem especificar o valor de saudacao para usar o valor padrão.
Chame a função novamente, desta vez especificando um valor personalizado para saudacao.
 */

fun saudacaoPersonalizada(nome: String, saudacao: String="Olá"){
    println("$saudacao, $nome!")
}


fun main(){
    saudacaoPersonalizada("Carlos")
    saudacaoPersonalizada("Carlos", "Bom Dia")
}
