package model

class Huevo (nombre: String, categoria: String): Ingredient (nombre, categoria) {
    init{
        elegirParte()
    }

    private var parte: String = "Completo"

    fun elegirParte(){
        println("Elija la parte a usar:")
        println("1. Completo \n2. Clara \n3. Yema")
        parte = readLine() ?: "1"

        when(parte){
            "1" -> parte = "Completo"
            "2" -> parte = "Clara"
            "3" -> parte = "Yema"
        }
    }
}