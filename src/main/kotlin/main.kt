import kotlin.random.Random

fun main(args: Array<String>) {
    println("Algo aprendí")

    //Rama 3; Ejercicio2
    println(Ejercicio1(10){ Random.nextInt(50,250)}.tablaSiete.contentToString())

    //Rama 3; Ejercicio3
    Filtrado().sinPares(Ejercicio1(10){ Random.nextInt(50,250)}.tablaSiete)

    println("Me costó pero lo conseguí")
}