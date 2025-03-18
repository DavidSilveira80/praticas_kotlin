package nichos.vendedor

/*
Descrição : Converter valores entre moedas locais e estrangeiras.
Tarefas :
Permitir que o usuário insira o valor em reais e a taxa de câmbio.
Exibir o valor convertido.
Passos :
Solicitar o valor em reais.
Solicitar a taxa de câmbio.
Multiplicar o valor em reais pela taxa de câmbio.
Exibir o resultado.
 */

import java.text.NumberFormat
import java.util.Locale

fun converterMoeda(valorReais: Double, valorMoedaEstrangeira: Double): Double{

    return valorReais * valorMoedaEstrangeira

}

fun converterEntradaParaDouble(entrada: String): Double{
    val entradaDouble = entrada
        .replace(".", "")
        .replace(",", ".").toDouble()
    return entradaDouble
}

fun main(){
    val formatoMoeda = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"))

    print("Informe o valor em REAIS: ")
    val reais = converterEntradaParaDouble(readln())
    print("Informe a taxa da moeda ESTRANGEIRA: ")
    val moedaEstrangeira = readln()
    val moedaEstrangeiraEmDouble = converterEntradaParaDouble(moedaEstrangeira)

    val convertidoEmReais = formatoMoeda.format(converterMoeda(reais, moedaEstrangeiraEmDouble))

    println("Para comprar $moedaEstrangeira de moeda estrangeira, vai lhe custar $convertidoEmReais")
    TODO("Primeira versão concluída, breve evoluir conversões")
}