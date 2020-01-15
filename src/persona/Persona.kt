package la.curso.kotlin.distribuircodigo.Persona

class Persona (val nombre: String, var edad: Int){
    val mayor: Boolean
        get() = if(edad >= 18 ) true else false

}




