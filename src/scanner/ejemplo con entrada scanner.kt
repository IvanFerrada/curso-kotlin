package scanner

import java.util.*


fun main (args: Array<String>){

    println("ingresa tu nombre o pulsa [Enter]")

    val teclado = Scanner(System.`in`)

    val nextLine =teclado.nextLine()

    val name = if(nextLine != " ") nextLine else "no es un nombre correcto!!"

    /* se puede concatenar  variables en el println con $nombre!  tambien se puede meter bloques de codigo como un if () entre llaves { if( ) }*/

    println("Hola $name!")
}