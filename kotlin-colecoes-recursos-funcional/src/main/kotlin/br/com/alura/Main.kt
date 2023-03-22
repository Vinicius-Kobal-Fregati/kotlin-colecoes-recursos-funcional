package br.com.alura

import br.com.alura.list.Prateleira
import br.com.alura.list.imprimeComMarcadores
import br.com.alura.list.teste.livros

fun main() {
    val prateleria = Prateleira(genero = "Literatura", livros = livros)

    val porAutor = prateleria.organizarPorAutor()
    val porAnoPublicacao = prateleria.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()
}