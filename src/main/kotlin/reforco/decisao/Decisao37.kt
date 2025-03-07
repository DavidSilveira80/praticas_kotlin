package reforco.decisao

/*
Escreva um programa que categorize uma pessoa com base em sua idade:

Menor de 13 anos: "Criança".
Entre 13 e 18 anos (inclusive): "Adolescente".
Maior de 18 anos: "Adulto".
Passo a passo:

Solicite ao usuário que insira sua idade.
Armazene a idade em uma variável.
Use a estrutura if..else if..else para verificar as condições:
Se a idade for menor que 13, imprima "Criança".
Se a idade estiver entre 13 e 18 (inclusive), imprima "Adolescente".
Caso contrário, imprima "Adulto".


*/

fun main(){
    val idade = 45

    if(idade < 13){
        println("CRIANÇA.")
    }else if(idade in 13..18){
        println("ADOLESCENTE.")
    }else{
        println("ADULTO.")
    }
}
