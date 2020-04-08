package model

class Leche (nombre: String, categoria: String): Ingredient(nombre, categoria){
    init {
        cambiarTemperatura()
    }

    private var temperatura: String = "Ambiente"

    fun cambiarTemperatura(){
        println("Elija la temperatura:")
        println("1. Fria \n2. Tibia \n3. Caliente \n4. Ambiente")
        temperatura = readLine() ?: "4"

        when(temperatura){
            "1" -> temperatura = "Fria"
            "2" -> temperatura = "Tibia"
            "3" -> temperatura = "Caliente"
            "4" -> temperatura = "Ambiente"
        }
    }
}