package reforco.funcoes

/*
Crie uma função chamada idadeCachorro que recebe a idade humana de um cachorro como parâmetro e
retorna a idade equivalente em anos de cachorro (considere que 1 ano humano equivale a 7 anos de cachorro).

Passo a passo:

Declare uma função chamada idadeCachorro.
Adicione um parâmetro chamado idadeHumana do tipo Int.
Especifique o tipo de retorno da função como Int.
No corpo da função, multiplique idadeHumana por 7 para calcular a idade equivalente em anos de cachorro.
Retorne o resultado usando a palavra-chave return.
Chame a função com diferentes idades humanas e verifique o resultado.

 */

fun idadeCachorro(idadeHumana: Int): Int{
    return idadeHumana * 7
}

fun main(){
    println(idadeCachorro(20))

}