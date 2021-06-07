import kotlin.random.Random

fun main(args: Array<String>) {
    println("Algo aprendí")

    //Rama 3; Ejercicio2
    println(Ejercicio1(10){ Random.nextInt(50,250)}.tablaDoSete.contentToString()) //número random entre 50 y 250

    //Rama 3; Ejercicio3
    Filtrado().sinPares(Ejercicio1(10){ Random.nextInt(50,250)}.tablaDoSete) //número random entre 50 y 250


}