package model

class Recipe {
    private var ingredientes = listOf<Any?>()

    fun agregarIngrediente(nuevo: Any?){
        ingredientes.plusElement(nuevo)
    }

    override fun toString(): String {
        var listaIngredientes = ""
        for (i in ingredientes){
            listaIngredientes.plus(i.toString())
        }
        return listaIngredientes
    }
}