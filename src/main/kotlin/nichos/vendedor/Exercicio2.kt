package nichos.vendedor

import java.text.NumberFormat
import java.util.Locale

fun verSeHeElegivelParaDesconto(quantidade: Int, valorTotal: Double): Boolean{
    val heElegivel : Boolean
    if(quantidade > 5 || valorTotal > 500.0){
        heElegivel = true
    }else{
        heElegivel = false
    }
    return heElegivel
}

fun calculandoDesconto(valorTotal: Double): Double{
    val valorComDesconto = valorTotal - ((valorTotal * 10) / 100)
    return valorComDesconto
}

fun main(){
    val formatoMoeda = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"))

    if(verSeHeElegivelParaDesconto(4, 550.0)){
        println(formatoMoeda.format(calculandoDesconto(550.0)))
    }else{
        println("Você não está elegivel para desconto.")
    }
}


/*
Objetivo Técnico:
Explorar o uso de condicionais e estruturas de controle para lidar com diferentes cenários de negócio.

História de Usuário:
"Como vendedor, preciso identificar se um cliente é elegível para um desconto especial de 10% caso ele tenha comprado mais de 5 itens ou gastado mais de R$ 500,00."

Passo a Passo:

Receba a quantidade de itens e o valor total da compra como entrada.
Verifique se o cliente atende a pelo menos uma das condições para o desconto.
Se for elegível, calcule o novo valor com o desconto aplicado.
Retorne uma mensagem informando se o cliente recebeu o desconto e o valor final.
Conceitos Necessários:
Condicionais (if/else).
Operadores lógicos (&&, ||).
Manipulação de números.

Exemplo I/O:

Entrada: Quantidade = 6, Valor Total = 450.0
Saída Esperada: "Cliente elegível para desconto! Valor Final: R$ 405,00"
 */