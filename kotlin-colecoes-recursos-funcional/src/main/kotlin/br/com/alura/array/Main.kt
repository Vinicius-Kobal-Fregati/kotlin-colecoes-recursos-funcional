package br.com.alura.array

fun main() {
    // Veja que é muito custoso trabalhar dessa forma, o certo seria utilizar alguma estrutura de dados
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33
    val idade4 = 20

    var maiorIdade = if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4) {
        idade1
    } else if (idade2 > idade1 && idade2 > idade3 && idade2 > idade4) {
        idade2
    } else if (idade3 > idade1 && idade3 > idade2 && idade3 > idade4) {
        idade3
    } else {
        idade4
    }

    println(maiorIdade)

    // Essa forma de trabalhar com arrays é mais custosa quando for adicionar itens
    val idades = IntArray(5)
    idades[0] = idade1
    idades[1] = idade2
    idades[2] = idade3
    idades[3] = idade4
    idades[4] = 55

    // Essa forma já facilita esse processo
    val idades2: IntArray = intArrayOf(idade1, idade2, idade3, idade4, 55)

    // Iteração normal do for
    maiorIdade = Int.MAX_VALUE
    for (idade in idades) {
        if (idade > maiorIdade)
            maiorIdade = idade
    }
    println(maiorIdade)

    // Iteração utilizando a função forEach
    var menorIdade = Int.MAX_VALUE
    idades2.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(menorIdade)
}