package com.santisteban.abel.laboratoriocalificado01

import org.junit.Test

// Clase de test para contar la frecuencia de caracteres
class Ejercicio01Kotlin {

    // Método que cuenta la frecuencia de caracteres en una palabra
    @Test
    fun main() {
        // Definimos la palabra de entrada
        val palabra = "hello"

        // Creamos un mapa mutable para almacenar la frecuencia de cada carácter
        val frecuencia = mutableMapOf<Char, Int>()

        // Iteramos sobre cada carácter de la palabra
        for (caracter in palabra) {
            // Si el carácter ya está en el mapa, incrementamos su contador
            if (frecuencia.containsKey(caracter)) {
                frecuencia[caracter] = frecuencia[caracter]!! + 1
            } else {
                // Si no está, lo añadimos al mapa con un contador inicial de 1
                frecuencia[caracter] = 1
            }
        }

        // Imprimimos el resultado
        println(frecuencia)
    }
}
