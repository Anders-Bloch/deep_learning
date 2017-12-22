class Node(val type : Type, val wIn: Array<W>) {

    val alpha = 0.9

    enum class Type {
        INPUT, HIDDEN, OUTPUT
    }

    fun output() : Double {
        return activation(wIn.sumByDouble { it.weight })
    }

    fun activation(x : Double) : Double {
        return 1/(1+Math.exp(-x))
    }

    fun dirivitiv(x : Double) : Double {
        return activation(x)*(1-activation(x))
    }
}

data class W(var weight: Double)

fun main(args: Array<String>){
    println("Hello kotlin")
}