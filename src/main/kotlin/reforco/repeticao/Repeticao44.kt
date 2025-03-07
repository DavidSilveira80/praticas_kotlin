package reforco.repeticao

/*
Desenvolva um programa que leia números inteiros do usuário até que ele insira
o número zero. Após isso, exiba a soma de todos os números inseridos (exceto o zero).

Passo a passo:

Inicialize uma variável para armazenar a soma dos números.
Use uma estrutura do..while para ler números inteiros do usuário.
Adicione cada número à variável de soma, exceto o zero.
Encerre o loop quando o usuário inserir o número zero.
Exiba a soma total dos números inseridos.

 */



fun main(){
    var somaDosNumeros = 0

    do{
        print("Digite qualquer número: Para sair Digite 0: ")
        var numero = readln().toInt()
        if(numero != 0){
            somaDosNumeros += numero
        }

    }while(numero !=0)
    println(somaDosNumeros)
}
