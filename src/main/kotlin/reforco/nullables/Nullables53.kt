package reforco.nullables

/*
Crie uma função chamada encontrarUsuarioPorId que recebe um ID de usuário como parâmetro e retorna o
nome do usuário encontrado ou null caso o usuário não exista. O retorno da função deve ser do
tipo String?, indicando que pode ser nulo.

Passo a passo:

Declare uma função chamada encontrarUsuarioPorId que recebe um parâmetro id: Int.
Dentro da função, crie uma lista de nomes de usuários simulando um banco de dados.
Use uma condição para verificar se o ID fornecido corresponde a um índice válido na lista.
Se o ID for válido, retorne o nome do usuário correspondente.
Caso contrário, retorne null.
Certifique-se de declarar o tipo de retorno da função como String? para permitir valores nulos.
 */


fun encontrarUsuarioProId(id: Int): String?{
    var resp : String?
    val nomes = mutableListOf(
        "João",
        "Maria",
        "Carlos",
        "Ana",
        "Pedro",
        "Lucas",
        "Mariana",
        "Felipe",
        "Beatriz",
        "Gabriel"
    )

    if(id in nomes.indices){
        resp = nomes[id]
    }else{
        resp = null
    }
    return resp
}

fun main(){
    println(encontrarUsuarioProId(10))
}
