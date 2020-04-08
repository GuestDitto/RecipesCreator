package model

class FrutasVerdurasCereal (nombre: String, categoria: String):Ingredient(nombre, categoria){
    init {
        cambiarTipo()
    }

    private var tipo: String = "Fresca"

    fun cambiarTipo(){
        println("Elija el tipo:")
        println("1. Fresco \n2. Seco \n3. Cocido")
        tipo = readLine() ?: "1"

        when(tipo){
            "1" -> tipo = "Fresco"
            "2" -> tipo = "Seco"
            "3" -> tipo = "Cocido"
        }
    }
}