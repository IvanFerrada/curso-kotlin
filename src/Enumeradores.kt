
enum class moneda(val simbolo: String){
    USD("$"),PEN("/$."),ARS("$"),MXN("$"),BOB("$"),CLP("$"),COP("$"),PYG("$"),UYU("$")
}

fun main (args: Array<String>){
    println(moneda.USD)
}



