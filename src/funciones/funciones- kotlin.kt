package funciones

/* comentario en kotlin */

fun main (args: Array<String>){
    println("hola mundo")

   println(suma(20, 50))

   println(resta(80, 40))
}

fun suma(a : Int, b : Int ): Int{
    return a + b

}

/* o usar simplificar de esta forma la funcion */

fun resta (e : Int, r : Int) = e -r


