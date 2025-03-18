package nichos.vendedor

/*
Descrição : Um vendedor precisa calcular o lucro com base no preço de compra e venda de um produto.
Tarefas :
Receber o preço de compra e o preço de venda.
Calcular e exibir o lucro.
Passos :
Solicitar ao usuário o preço de compra.
Solicitar ao usuário o preço de venda.
Subtrair o preço de compra do preço de venda.
Exibir o lucro.
 */

import java.text.NumberFormat
import java.util.Locale


fun calcularLucro(precoDeCompra: Double, precoDevenda: Double): Double{

    return precoDevenda - precoDeCompra
}

fun converteEntradaParaDouble(entrada: String): Double{
    val entradaDouble = entrada
        .replace(".", "")
        .replace(",", ".").toDouble()
    return entradaDouble
}


fun main(){

    val formatoMoeda = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"))

    print("Informe o preço de compra do produto: R$ ")
    val precoCompra = converteEntradaParaDouble(readln())
    print("Informe o preço de venda do Produto: R$ ")
    val precoVenda = converteEntradaParaDouble(readln())

    val lucro = formatoMoeda.format(calcularLucro(precoCompra, precoVenda))

    println("O seu lucro é de $lucro")
}
