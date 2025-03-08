package reforco.funcoes

/*
Crie uma função chamada cumprimentar que recebe o nome de uma pessoa como parâmetro e
imprime "Olá, [nome]!".

Passo a passo:

Declare uma função chamada cumprimentar.
Adicione um parâmetro chamado nome do tipo String.
No corpo da função, use println para exibir a mensagem formatada com o nome fornecido.
Chame a função passando diferentes nomes como argumento para testar seu funcionamento.
 */

fun cumprimentar(nome: String){
    println("Olá, $nome!!!")
}

fun main(){
    cumprimentar("Fulano")
}
