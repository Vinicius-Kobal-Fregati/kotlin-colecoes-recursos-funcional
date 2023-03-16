package br.com.alura.array

fun main() {
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33
    val idade4 = 20

    val maiorIdade = if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4) {
        idade1
    } else if (idade2 > idade1 && idade2 > idade3 && idade2 > idade4) {
        idade2
    } else if(idade3 > idade1 && idade3 > idade2 && idade3 > idade4) {
        idade3
    } else {
        idade4
    }

    println(maiorIdade)

    val idades = IntArray(4)
    idades[0] = idade1
    idades[1] = idade2
    idades[2] = idade3
    idades[3] = idade4
}