package br.com.alura.list

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {
    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAnoPublicacao(): List<Livro> {
        // Cria uma lista nova ordenada
        return livros.sortedBy { it.anoDePublicacao }
    }

    fun organizarPorTituloAlterandoListaOriginal(): MutableList<Livro> {
        val listaAlteravel: MutableList<Livro> = livros.toMutableList()
        // Altera a ordem da lista original
        listaAlteravel.sortBy { it.titulo }
        return listaAlteravel
    }
}