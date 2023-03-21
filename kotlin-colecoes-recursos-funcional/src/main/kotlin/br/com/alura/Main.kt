package br.com.alura

import br.com.alura.list.Livro
import br.com.alura.list.imprimeComMarcadores

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoDePublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoDePublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoDePublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoDePublicacao = 1865,
        editora = "Editora B"
    )

    val listaLivrosComNulos: MutableList<Livro?> =
        mutableListOf(null, livro1, livro2, null, livro3, livro4)
    listaLivrosComNulos.imprimeComMarcadores()
}