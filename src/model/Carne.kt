package model

class Carne (nombre: String, categoria: String): Ingredient(nombre, categoria){
    init {
        cambiarTermino()
        cambiarCoccion()
    }

    private var termino: String = "Cocido"
    private var metodoCoccion: String = "Plancha"

    fun cambiarCoccion(){
        println("Elija el metodo de coccion:")
        println("1. Plancha \n2. Grill \n3. Horno")
        metodoCoccion = readLine() ?: "1"

        when(metodoCoccion){
            "1" -> metodoCoccion = "Plancha"
            "2" -> metodoCoccion = "Grill"
            "3" -> metodoCoccion = "Horno"
        }
    }

    fun cambiarTermino() {
        println("Elija el termino:")
        println("1. Cocido \n2. Medio \n3. Tres Cuartos \n4. Cocido")
        termino = readLine() ?: "4"

        when(termino){
            "1" -> termino = "Sellado"
            "2" -> termino = "Medio"
            "3" -> termino = "Tres Cuartos"
            "4" -> termino = "Cocido"
        }
    }

}