package variables

/* Crear variables en kotlin */

/* La diferencia  entre val y var  es que val es como una constante no se puede cambiar el valor  y las variables de tipo entero no se pude cambiar su valor a un tipo string o otro dato */



fun main(args: Array<String>){

    val nombre = "ivan"

    var edad = 24

    /* podemos definir el tipo de dato si queremos */

    val apellido : String = "ferrada"

    var dni : Int = 39302172

    var estadoCivil : Boolean = false

    println(nombre)
    println(apellido)
    println(edad)
    println(dni)
    println(estadoCivil)

}
