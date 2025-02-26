package nichos.vendedor

import java.text.NumberFormat
import java.util.Locale

fun formatadorDeMoeda(valor:Double): String{
    val formatoMoeda = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"))
    val valorFormatado = formatoMoeda.format(valor)
    return valorFormatado
}

fun calcularDescontoDoValorUnitario(preco: Double, desconto: Int):Double{
    return preco - ((preco * desconto) / 100)
}

fun somarValorTotal(quantidade: Int, preco: Double, desconto: Int){
    var contador = 1
    var valorTotal = 0.0
    while(contador <= quantidade){
        valorTotal += calcularDescontoDoValorUnitario(preco, desconto)
        contador++
    }
    println("Valor Total: " + formatadorDeMoeda(valorTotal))
}

fun main(){
    somarValorTotal(10,20.0, 5)

}

/*

Objetivo Técnico:
Praticar o uso de funções básicas e tipos de dados em Kotlin para resolver um problema simples.

História de Usuário:

"Como vendedor, preciso calcular o valor total de uma venda com base na quantidade de itens e no preço unitário, considerando que cada item tem um desconto fixo de 5%."

Passo a Passo:

Identifique quais dados são necessários para realizar o cálculo (quantidade, preço unitário, desconto).
Crie uma função que receba esses dados como parâmetros.
Aplique o desconto ao preço unitário antes de calcular o valor total.
Retorne o valor total formatado como moeda (ex.: "R$ 100,00").

Conceitos Necessários:

Declaração de funções.

Tipos de dados (Int, Double, String).
Formatação de strings.

Exemplo I/O:

Entrada: Quantidade = 10, Preço Unitário = 20.0
Saída Esperada: "Valor Total: R$ 190,00"
 */