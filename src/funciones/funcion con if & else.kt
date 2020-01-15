package funciones

fun main (args: Array<String>){

    println(mayorEdad(18))
    println(mayorEdad(10))
    println(ejemplo(20))
    println(ejemplo(15))
}

/* if & else */



fun mayorEdad (edad: Int) = if (edad >= 18) true else false

/* otro funciones.ejemplo*/

fun ejemplo (bloque: Int) = if(bloque >= 18){

    println("hola tenes 18")

}else{

    println("No tenes 18!!")
}