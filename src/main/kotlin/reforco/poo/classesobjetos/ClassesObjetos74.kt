package reforco.poo.classesobjetos

/*
Descrição: Neste exercício, você aprenderá a receber dados através do construtor de uma classe,
 possibilitando a configuração de atributos logo na criação do objeto.
Tarefas:

Declarar uma classe que possua um construtor com parâmetros.
Instanciar a classe fornecendo os valores necessários.
Utilizar os parâmetros para inicializar atributos internos da classe.
Passos:
Defina uma classe com um construtor que aceite um ou mais parâmetros.
Crie instâncias da classe, passando os valores adequados para o construtor.
Verifique se os atributos da classe estão sendo corretamente inicializados com os parâmetros
 fornecidos.
Documente o comportamento observado.
 */

class Aluno(val nome: String, var idade: Int){

}

fun main(){
    val aluno1 = Aluno("Jonas", 45)

    println(aluno1.nome) // acessa a variável imutável nome
    println(aluno1.idade) // acessa a variável mutável idade
}
