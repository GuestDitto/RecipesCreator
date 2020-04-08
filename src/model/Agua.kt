package model

class Agua (nombre: String, categoria: String): Ingredient(nombre, categoria){
    init {
        cambiarTipo()
        cambiarTemperatura()
    }
    private var tipo: String = "Natural"
    private var temperatura: String = "Ambiente"

    fun cambiarTipo(){
        println("Elija el tipo:")
        println("1. Carbonatada \n2. Natural")
        tipo = readLine() ?: "2"

        when(tipo){
            "1" -> tipo = "Natural"
            "2" -> tipo = "Carbonatada"
        }
    }

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