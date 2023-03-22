package br.com.alura.list.teste

import br.com.alura.list.Livro

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
val listaDeLivrosComNulos: MutableList<Livro?> = mutableListOf(livro1, null, livro2, livro3, null, livro4)