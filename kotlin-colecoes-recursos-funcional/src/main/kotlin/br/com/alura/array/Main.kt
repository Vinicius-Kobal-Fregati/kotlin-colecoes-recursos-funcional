package br.com.alura.array

fun main() {
    val salarios: DoubleArray = doubleArrayOf(
        1500.50,
        2300.0,
        5000.0,
        8000.0,
        10000.0
    )

    val aumento = 1.1
    var indice = 0
    // Esse é o pior dos cenários, ficamos com a responsabilidade de gerenciar o index
    for (salario in salarios) {
        salarios[indice] = salario * aumento
        indice++
    }

    // Forma de exibir os elementos do array como string
    println(salarios.contentToString())

    // Assim o index é gerenciado pelo programa, mas o código fica mais verboso
    for (indice2 in salarios.indices) {
        salarios[indice2] = salarios[indice2] * aumento
    }

    println(salarios.contentToString())

    // Forma mais recomendada de se trabalhar com o for nesses casos que se precisa do index
    for ((indice3, salario) in salarios.withIndex()) {
        salarios[indice3] = salario * aumento
    }

    println(salarios.contentToString())

    // Algo semelhante ao anterior, mas com forEach
    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println(salarios.contentToString())
}