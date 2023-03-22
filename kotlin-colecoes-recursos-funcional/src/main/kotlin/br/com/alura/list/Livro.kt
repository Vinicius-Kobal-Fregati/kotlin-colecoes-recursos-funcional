package br.com.alura.list

data class Livro(
    val titulo: String,
    val autor: String,
    val anoDePublicacao: Long,
    val editora: String? = null
): Comparable<Livro> {
    override fun compareTo(other: Livro): Int {
        return this.anoDePublicacao.compareTo(other.anoDePublicacao)
    }
}