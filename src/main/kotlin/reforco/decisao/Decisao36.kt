package reforco.decisao

/*
Desenvolva um programa que classifique um aluno com base em sua nota:

Nota abaixo de 5: "Reprovado".
Nota entre 5 e 7 (inclusive): "Recuperação".
Nota acima de 7: "Aprovado".
Passo a passo:

Solicite ao usuário que insira a nota do aluno.
Armazene a nota em uma variável.
Use a estrutura if..else if..else para verificar as condições:
Se a nota for menor que 5, imprima "Reprovado".
Se a nota estiver entre 5 e 7 (inclusive), imprima "Recuperação".
Caso contrário, imprima "Aprovado".

*/

fun main(){
    val nota = 8

    if(nota < 5){
        println("REPROVADO")
    }else if(nota in 5..7){
        println("RECUPERAÇÃO")
    }else{
        println("APROVADO")
    }
}
