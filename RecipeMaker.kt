@file:Suppress("CAST_NEVER_SUCCEEDS")

fun main() {
    var opcion: String?
    var categoria: String = "Ninguna"
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
            "1" -> categoria = makeRecipe()
            "2" -> viewRecipe(categoria)
            "3" -> println("Ha seleccionado salir.")
            else -> println("Opcion incorrecta.")
        }
    }while(opcion != "3")
}

fun makeRecipe(): String{
    val categorias = arrayOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceites")
    var opcion: String? = ""
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
        opcion = (readLine() ?: 0) as String?
    }while (opcion == "0")
    return categorias[opcion?.toInt()?.minus(1)!!]
}

fun viewRecipe (categoria: String) {
    println("\t:: Ver mis recetas ::")
    println("Categoria de ingrediente seleccionado: $categoria")
}