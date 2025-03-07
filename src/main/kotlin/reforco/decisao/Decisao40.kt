package reforco.decisao

fun main(){
    val vogal = "B"

    when{
        vogal in "aeiouAEIOU" -> println("VOGAL")
        else -> println("NÃO É VOGAL")
    }
}
