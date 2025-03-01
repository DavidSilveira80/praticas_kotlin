package nichos.vendedor

fun retornaListaDeProdutosComEstoqueAbaixoDe10(
    produtos: List<Map<String, Any>>): List<Map<String, Any>>{

    return produtos.filter { (it["estoque"] as? Int ?: 0) < 10}
}

fun calculaCustosDeReposicao(produtosParaReposicao: List<Map<String, Any>>): List<Map<String, Any>> {
    return produtosParaReposicao.map { produto ->

        val estoqueAtual = produto["estoque"] as? Int ?: 0
        val custoUnitario = produto["custo"] as? Double ?: 0.0
        val nome = produto["nome"] as? String ?: "Produto Desconhecido"
        val unidadesFaltantes = 10 - estoqueAtual
        val custoReposicao = unidadesFaltantes * custoUnitario
        mapOf("Produto" to nome, "Custo Reposição" to custoReposicao)
    }
}

fun main(){
    val listaProdutos = mutableListOf(
        mutableMapOf("nome" to "Tênis Esportivo", "estoque" to 15, "custo" to 250.0),
        mutableMapOf("nome" to "Bota Feminina", "estoque" to 8, "custo" to 320.0),
        mutableMapOf("nome" to "Sapato Social Masculino", "estoque" to 10, "custo" to 400.0),
        mutableMapOf("nome" to "Chinelo Casual", "estoque" to 20, "custo" to 50.0),
        mutableMapOf("nome" to "Sapatilha Feminina", "estoque" to 12, "custo" to 150.0),
        mutableMapOf("nome" to "Sandália de Salto", "estoque" to 5, "custo" to 280.0),
        mutableMapOf("nome" to "Coturno Masculino", "estoque" to 7, "custo" to 350.0),
        mutableMapOf("nome" to "Tênis Casual", "estoque" to 18, "custo" to 220.0),
        mutableMapOf("nome" to "Mocassim", "estoque" to 9, "custo" to 270.0),
        mutableMapOf("nome" to "Pantufa", "estoque" to 14, "custo" to 100.0)
    )

    val lista2 = retornaListaDeProdutosComEstoqueAbaixoDe10(listaProdutos)

    println(calculaCustosDeReposicao(lista2))


}