package model

class Aceite (nombre: String, categoria: String): Ingredient (nombre, categoria) {
    init {
        cambiarTemperatura()
    }

    private var temperatura: Int = 0

    fun cambiarTemperatura(){
        println("Ingrese la temperatura en C°: ")
        temperatura = readLine()?.toInt() ?: 0
    }
}