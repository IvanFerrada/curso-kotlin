package clases

fun main (args: Array<String>){
    val user = user("ivan", 24)
    println(user.nombre)
    println(user.edad)

    user.edad = 15
    println(user.edad)
    println(user.mayor)

}

class user (val nombre: String,var edad: Int){
    val mayor:Boolean
        get(){
            return if (edad >= 18) true else false
        }

}