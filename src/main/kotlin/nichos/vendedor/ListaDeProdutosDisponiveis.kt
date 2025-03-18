package nichos.vendedor

/*
Descrição : Exibir uma lista de produtos disponíveis para venda.
Tarefas :
Criar uma lista de produtos.
Exibir todos os produtos na tela.
Passos :
Criar uma lista de produtos (usando arrays ou listas).
Iterar sobre a lista e exibir cada produto.
 */

fun listarProdutos(produtos: List<String>){
    for(produto in produtos ){
        println(produto)
    }
}

fun main(){
    val listaProdutos = mutableListOf("Espelho", "Cadeira", "Almofada", "Cabideiro", "Tapete",
                                      "Cortina de Banheiro", "Cortina de Quarto", "Cortina de Sala")

    println("LISTAGEM DOS PRODUTOS DISPONÍVEIS")
    listarProdutos(listaProdutos)

}
