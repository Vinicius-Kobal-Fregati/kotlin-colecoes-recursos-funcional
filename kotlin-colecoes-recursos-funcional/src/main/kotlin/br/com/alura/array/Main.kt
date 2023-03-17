package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios = Array<BigDecimal>(2) { BigDecimal.ZERO }
    salarios[0] = "1500.55".toBigDecimal()
    salarios[1] = "2000.00".toBigDecimal()

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salarios2 = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salarios2.contentToString())

    // Cria uma nova lista/array mantendo o original
    val salariosComAumento: Array<BigDecimal> = salarios2
        .map { salario ->
            if (salario < "5000.00".toBigDecimal()) {
                salario + "500.00".toBigDecimal()
            } else {
                (salario * aumento).setScale(2, RoundingMode.UP)
            }
        }
        .toTypedArray()

    println(salariosComAumento.contentToString())
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}