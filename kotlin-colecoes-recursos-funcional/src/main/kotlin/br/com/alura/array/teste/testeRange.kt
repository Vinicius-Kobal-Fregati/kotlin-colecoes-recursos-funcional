package br.com.alura.array.teste

fun testeRange() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }
    println()

    // Inclusivo, o 100 vai participar
    val numerosPares: IntProgression = 0..100 step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }
    println()

    // Nesse caso, o 100 não participa
    val numerosPares2: IntProgression = 2.until(100) step 2
    for (numeroPar in numerosPares2) {
        print("$numeroPar ")
    }
    println()

    val numerosParesReverso: IntProgression = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("$it ") }
    println()

    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    // Verifica se o valor está dentro do intervalo
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    val alfabeto: CharRange = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)
    println('K' in alfabeto)
}