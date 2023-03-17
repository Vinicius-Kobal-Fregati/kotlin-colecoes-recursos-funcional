package br.com.alura.array.teste

fun testeOperacoesDeAgregacao() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade: Int? = idades.maxOrNull()
    val menorIdade: Int? = idades.minOrNull()

    println("Maior idade: $maiorIdade")
    println("Menor idade: $menorIdade")

    val media: Double = idades.average()
    println("Média: $media")

    // Verifica se todos os elementos satisfazem uma condição
    val todosMaiores: Boolean = idades.all { it >= 18 }
    println("Todos maiores? $todosMaiores")

    val existeMaior: Boolean = idades.any { it >= 18 }
    println("Algum aluno é maior de idade? $existeMaior")

    // Devolve uma nova lista com apenas os elementos que satisfazem a condição
    val maioresDeIdade: List<Int> = idades.filter { it >= 18 }
    println("Maiores: $maioresDeIdade.")

    val busca: Int? = idades.find { it >= 18 }
    println("Busca: $busca")
}