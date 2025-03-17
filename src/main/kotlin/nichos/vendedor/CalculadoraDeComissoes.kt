package nichos.vendedor

/*
Como vendedor em um nicho de beleza e cosméticos, quero calcular minha comissão com base nas
vendas diárias e metas alcançadas para projetar meu lucro e identificar oportunidades de crescimento .

Tarefas e Passos:

Definir funções para cálculos de comissão
Crie uma função calcularComissaoBasica() que receba o valor total de vendas (vendas: Double) e
retorne uma porcentagem fixa (ex.: 10%) .
Desenvolva uma função calcularBonusMeta() que verifique se as vendas ultrapassaram um valor
específico (ex.: R$ 5.000) e adicione um bônus de 5% .
Implementar validação de dados
Crie uma função validarVendas() para garantir que o valor inserido seja positivo e não contenha
erros de formatação .
Criar função de relatório personalizado
Desenvolva gerarRelatorio() para exibir resultados formatados, incluindo comissão total,
bônus (se aplicável) e sugestões para atingir
metas futuras (ex.: "Faltam R$ 800,00 para a meta de R$ 5.000,00") .
Estruturar interação no main()
Use readLine() para capturar o valor de vendas do usuário .
Chame as funções de cálculo e relatório sequencialmente, garantindo fluxo lógico .
Objetivo de Aprendizado:
Praticar funções com parâmetros e retorno de valores,
tratamento de erros e modularização de código, aplicando conceitos a um contexto real de vendas

 */
import java.text.NumberFormat
import java.util.Locale



fun calcularComissaoBasica(vendas: Double): Double{
    val comissao10PorCento = (vendas * 10) / 100
    return comissao10PorCento
}

fun calcularBonusMeta(vendas: Double): Double{
    val bonus: Double
    if(vendas > 5000.0){
        bonus = (vendas * 5) / 100
    }else{
        bonus = 0.0
    }
    return bonus
}

fun calcularQuantoFaltaParaMeta(vendas: Double): Double{
    val faltam : Double
    if(vendas >= 5000.0){
        faltam = 0.0
    }else{
        faltam = 5000.0 - vendas
    }
    return faltam
}

fun gerarRelatorio(vendas: String, comissao: String, bonus: String, faltamMeta: String){
    val saida = """
        |
        |A Comissão de 10% das suas vendas de  $vendas são de  $comissao
        |O Bônus de 5% para vendas acima de R${'$'} 5000,00 é de  $bonus
        |Faltam $faltamMeta para a meta de R${'$'} 5000,00
    """.trimMargin()
    println(saida)
}

fun validarVenda(venda: Double): Boolean{
    if(venda <= 0){
        return false
    }else{
        return true
    }
}

fun main(){
    print("Informe o valor total das suas vendas(Valor MAIOR QUE 0.0) R$: ")
    val vendas = readln().toDouble()

    if(validarVenda(vendas)){
        val comissaoBasica = formatadorDeMoeda(calcularComissaoBasica(vendas))
        val bonusMeta = formatadorDeMoeda(calcularBonusMeta(vendas))
        val faltamParaMeta = formatadorDeMoeda(calcularQuantoFaltaParaMeta(vendas))

        gerarRelatorio(formatadorDeMoeda(vendas), comissaoBasica, bonusMeta, faltamParaMeta)
    }else{
        println("VALOR INVÁLIDO. VALOR MENOR QUE 0.0")
        println("TENTE NOVAMENTE.")
    }
}
