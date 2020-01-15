import la.curso.kotlin.distribuircodigo.Persona.Persona


fun main (args: Array<String>){

    val Persona = Persona("ivan",24)
    println(Persona.nombre)
    println(Persona.edad)
    println(Persona.mayor)

    Persona.edad = 24
    println(Persona.edad)
    println(Persona.mayor)

}

