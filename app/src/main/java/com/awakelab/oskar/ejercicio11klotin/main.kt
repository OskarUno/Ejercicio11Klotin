package com.awakelab.oskar.ejercicio11klotin

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