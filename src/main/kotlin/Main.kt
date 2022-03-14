fun main() {
    val data = listaDeDados()
    /*
    println("Tenho dados? ${if(data.any()) "sim" else "não"}")
    println("Tenho ${data.count()} elementos")

    println(data.first().nome)
    println(data.last())
    println(listOf<Int>().firstOrNull())
    println(listOf<Int>().lastOrNull())

    println(listOf(1,2,3).sum())
    println(data.sumOf { it.calorias })
    println(listOf(1,2,3).maxOf { it })
    println(listOf(1,2,3).maxOrNull())
    println(data.maxByOrNull { it.calorias })
    println(data.maxOf { it.calorias })

    println(data.filter { it.nome == "Lasanha"  })
    println(data.filter { it.calorias > 500  })
    println(data.any { it.calorias > 500  })
    println(data.count { it.calorias > 500  })

    println(data.take(2))
    println(data.takeLast(2))

    data.forEach{ println(it.nome) }
    data.filter { it.calorias > 500 }.forEach{println(it.nome)}

    println(data.map { it.nome })

    println(listOf(1,2,3).average())
    println(data.map{ it.calorias}.average())
    */
    val list = listOf(1, 2, 3, 9, 3, 3, 3, 8, 6, 7, 7, 7)
    println(list.distinct())
    println(list.sorted())
    println(list.sortedDescending())
    println(list.reversed())
}

private fun listaDeDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)