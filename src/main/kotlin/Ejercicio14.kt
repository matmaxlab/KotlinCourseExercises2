//El helado perfecto!!! Calcular el área de un helado

fun main() {

    val radio: Float
    val bocha: Double
    val cuadrad: Float
    val base: Float
    val altura: Float
    val cucurucho: Double
    val icecream: Double

    print("\nIngrese el radio de la bocha del helado: ")
    radio = readLine()!!.toFloat()
    print("Ingrese la altura del cucurucho: ")
    altura = readLine()!!.toFloat()

    cuadrad = radio * radio
    base = radio * 2
    bocha = (cuadrad * Math.PI)/2
    cucurucho = ((base * altura)/2).toDouble()
    icecream = bocha + cucurucho

    print("\nEl área total del helado perfecto es igual a: $icecream \n")

}