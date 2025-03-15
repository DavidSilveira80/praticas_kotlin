package reforco.nullables

/*
Desenvolva uma função chamada obterMensagemPadrao que recebe uma mensagem do tipo String? e retorna
a mensagem fornecida ou uma mensagem padrão ("Olá, mundo!") caso a mensagem seja nula. Utilize o
elvis operator (?:) para implementar essa lógica.

Passo a passo:

Declare uma função chamada obterMensagemPadrao que recebe um parâmetro mensagem: String?.
Use o elvis operator (?:) para retornar a mensagem fornecida se ela não for nula.
Caso a mensagem seja nula, retorne a string "Olá, mundo!".
Teste a função com diferentes valores, incluindo null, para verificar o comportamento.
 */


fun obterMensagemPadrao(mensagem: String? = "Pateta"): String{
    return mensagem ?: "Olá Mundo!"
}

fun main(){
    println(obterMensagemPadrao("Tudo Certo?"))
    println(obterMensagemPadrao(null))
    println(obterMensagemPadrao())
    println(obterMensagemPadrao(null))
}
