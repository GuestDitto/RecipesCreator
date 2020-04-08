package model

abstract class Ingredient(val nombre: String, val categoria: String){
    init {
        cambiarCantidad()
    }

    private var cantidad: Int = 1

    protected fun cambiarCantidad(){
        println("Ingresa la cantidad: ")
        cantidad = readLine()?.toInt() ?: 1
    }

    override fun toString(): String {
        return "\n$categoria: $nombre \nCantidad: $cantidad"
    }
}