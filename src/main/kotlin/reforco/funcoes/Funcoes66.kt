package reforco.funcoes

/*
Crie uma função chamada apresentar que recebe dois parâmetros: nome e idade. Use nomes explícitos para
os parâmetros ao chamar a função e imprima a mensagem "Meu nome é [nome] e eu tenho [idade] anos.".

Passo a passo:

Declare uma função chamada apresentar.
Adicione dois parâmetros: nome do tipo String e idade do tipo Int.
No corpo da função, use println para exibir a mensagem formatada com os valores dos parâmetros.
Ao chamar a função, use nomes explícitos para os parâmetros (ex.: nome = "João", idade = 25).
Teste a função com diferentes valores para verificar o funcionamento.
 */

fun apresentar(nome: String, idade: Int) {
    println("Meu nome é $nome e tenho $idade anos.")
}

fun main(){
    apresentar(nome="João", idade=25)
    apresentar(nome="Danilo", idade=32)
}
