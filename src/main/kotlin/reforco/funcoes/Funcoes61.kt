package reforco.funcoes

/*
Crie uma função chamada mensagemPrivada que só pode ser acessada dentro do mesmo arquivo onde
foi declarada. A função deve imprimir "Esta é uma mensagem privada".

Passo a passo:

Use o modificador de visibilidade private ao declarar a função.
Nomeie a função como mensagemPrivada.
Certifique-se de que a função não tenha parâmetros.
No corpo da função, use println para exibir a mensagem "Esta é uma mensagem privada".
Tente chamar a função dentro do mesmo arquivo e observe seu funcionamento.
Tente acessar a função de outro arquivo e observe o erro gerado.
 */

private fun mensagemPrivada(){
    println("Esta é uma mensagem privada.")
}

fun main(){
    mensagemPrivada()
}