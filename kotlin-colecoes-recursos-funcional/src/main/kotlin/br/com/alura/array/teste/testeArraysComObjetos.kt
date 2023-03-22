package br.com.alura.array.teste

import br.com.alura.array.bigDecimalArrayOf
import br.com.alura.array.media
import br.com.alura.array.somatoria
import java.math.BigDecimal
import java.math.RoundingMode

fun testeArraysComObjetos() {
    val salarios = Array<BigDecimal>(2) { BigDecimal.ZERO }
    salarios[0] = "1500.55".toBigDecimal()
    salarios[1] = "2000.00".toBigDecimal()

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salarios2 = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salarios2.contentToString())

    // Cria uma nova lista/array mantendo o original
    val salariosComAumento: Array<BigDecimal> = salarios2
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    // Forma semelhante ao reduce mas já tento um valor inicial no acumulador
    val gastoTotal: BigDecimal = salariosComAumento
        .fold((gastoInicial)) { acumulador, salario ->
            acumulador + (salario * meses).setScale(2, RoundingMode.UP)
        }
    println(gastoTotal)

    /*
    // Forma utilizando variáveis temporárias
    val salariosOrdenados = salariosComAumento.sorted()
    //val tresPrimeirosSalarios = salariosOrdenados.take(3)
    val tresUltimosSalarios = salariosOrdenados.takeLast(3)
        .toTypedArray()
    val mediaTresUltimosSalarios = tresUltimosSalarios.media()
    println(mediaTresUltimosSalarios)
     */

    // Forma encadeando as funções
    val mediaTresUltimosSalarios = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()

    println(mediaTresUltimosSalarios)

    val mediaTresMenoresSalarios = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()

    println(mediaTresMenoresSalarios)
}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal =
    if (salario < "5000.00".toBigDecimal()) {
        salario + "500.00".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }