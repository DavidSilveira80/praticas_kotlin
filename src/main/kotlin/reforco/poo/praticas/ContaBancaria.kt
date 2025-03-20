package reforco.poo.praticas

/*
Descrição: Crie uma classe ContaBancaria que simule uma conta com saldo, titular e número
da conta.
Tarefas:

Implemente atributos privados para saldo e número da conta.
Forneça métodos públicos para depósito, saque e consulta de saldo.
Garanta que o saldo não seja acessível diretamente, apenas via métodos.
Passos:
Declare a classe com propriedades privadas.
Crie métodos depositar(), sacar() e consultarSaldo().
Valide operações (ex.: saque não pode deixar saldo negativo).
Conceitos: Encapsulamento, propriedades privadas, métodos de acesso
 */

class ContaBancaria(
    private var saldo: Double,
    val titular: String,
    private val numeroDaConta: String
){


    fun deposito(valorDeposito: Double){
        saldo += valorDeposito
    }

    fun saque(valorSaque: Double){
        saldo -= valorSaque
    }

    fun consultaSaldo(): Double{
        return saldo
    }
}


fun main(){
    val conta1 = ContaBancaria(150.89, "David", "123xpto")

    println(conta1.consultaSaldo())
}
