package com.awakelab.oskar.ejercicio11klotin
/*
fun main() {
    var n1: Int = 10
    val n2: Int = 33
    val n3: Int = 66
    var suma = n1 + n2 + n3
    println("Suma1: $suma")
    n1 = 55
    suma = n1 + n2 + n3
    println("Suma2: $suma")
    val promedio = suma / 3
    println("Promedio: $promedio")

}
*/

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        println("Like to: $hobby")
        if(referrer == null){
            println("Doesn't have a referrer")
        }else{
            println("Has a referrer named ${referrer.name}, Has a referrer named $hobby ")
        }

    }
}