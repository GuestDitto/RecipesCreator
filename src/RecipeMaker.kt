@file:Suppress("CAST_NEVER_SUCCEEDS")

import model.*

fun main() {
    var opcion: String?
    var receta: Recipe = Recipe()

    var ingredientes = listOf<Any?>()

    do{
        val menu: String = """
	        :: Bienvenido a Recipe Maker ::
            Seleccione la opción deseada.
            1. Hacer una receta.
            2. Ver mis recetas.
            3. Salir
        """.trimIndent()
        println("\n $menu")
        opcion = (readLine() ?: 0) as String?

        when (opcion) {
            "1" -> receta.agregarIngrediente(chooseCategory())
            "2" -> viewRecipe(receta)
            "3" -> println("Ha seleccionado salir.")
            else -> println("Opcion incorrecta.")
        }
    }while(opcion != "3")
}

fun chooseCategory(): Any? {
    val categorias = arrayOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceites")
    var opcion: Int = 0
    do{
        val menu: String = """
        :: Hacer una receta ::
        Selecciona por categoría el ingrediente que buscas
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceites
    """.trimIndent()
        println("\n $menu")
        opcion = readLine()?.toInt() ?: 0
    }while (opcion == 0)
    return chooseIngredient(categorias[opcion.minus(1)])
}

fun chooseIngredient(opcion: String): Any? {
    var ingrediente: Any? = null
    val leche = arrayOf("Vaca", "Almendra", "Avena", "Soya")
    val carne = arrayOf("Cerdo", "Vaca", "Pollo", "Conejo", "Cordero")
    val verduras = arrayOf("Calabaza", "Chile", "Brocoli", "Pimiento", "Berenjena")
    val frutas = arrayOf("Fresa", "Platano", "Uvas", "Manzana", "Naranja", "Pera", "Cereza")
    val cereal = arrayOf("Avena", "Trigo", "Arroz", "Maiz")
    val aceite = arrayOf("Girasol", "Soya", "Coco")

    val printIt = {lista: Array<String> ->
        var cont = 1
        for(i in lista){
            println("$cont. $i ")
            cont++
        }
        lista[readLine()?.toInt()?.minus(1) ?: 0]
    }

    println("Selecciona el ingrediente")
    when (opcion) {
        "Agua" -> ingrediente = Agua("Agua", opcion)
        "Leche" -> ingrediente = Leche(printIt(leche), opcion)
        "Carne" -> ingrediente = Carne(printIt(carne), opcion)
        "Verduras" -> ingrediente = FrutasVerdurasCereal(printIt(verduras), opcion)
        "Frutas" -> ingrediente = FrutasVerdurasCereal(printIt(frutas), opcion)
        "Cereal" -> ingrediente = FrutasVerdurasCereal(printIt(cereal), opcion)
        "Huevo" -> ingrediente = Huevo("Huevo", opcion)
        "Aceites" -> ingrediente = Aceite(printIt(aceite), opcion)
    }
    return ingrediente
}

fun viewRecipe (receta: Recipe) {
    println("\t:: Ver mis recetas ::")
    println("Categoria de ingrediente seleccionado: ${receta.toString()}")
}