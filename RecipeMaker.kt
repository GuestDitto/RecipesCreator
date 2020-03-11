fun main() {
    var opcion: String?
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
            "1" -> println("Ha seleccionado hacer una receta.")
            "2" -> println("Ha seleccionado ver recetas.")
            "3" -> println("Ha seleccionado salir.")
            else -> println("Opcion incorrecta.")
        }
    }while(opcion != "3")
}