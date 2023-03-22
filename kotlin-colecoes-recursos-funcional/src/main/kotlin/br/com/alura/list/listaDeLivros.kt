package br.com.alura.list

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

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoDePublicacao = 1946
        )
    )

    livros.imprimeComMarcadores()

    livros.remove(livro1)

    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo: List<Livro> = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    val ordenadoPorAutor: List<Livro> = livros.sortedBy { it.autor }
    ordenadoPorAutor.imprimeComMarcadores()

    livros
        .filter { it.autor == "João Guimarães Rosa" }
        .sortedBy { it.anoDePublicacao }
        .imprimeComMarcadores()

    val titulos: List<String> = livros
        .filter { it.autor.startsWith("Helena") }
        .sortedBy { it.anoDePublicacao }
        .map { it.titulo }

    println(titulos)
}