//Realizar un programa que solicite ingresar dos números enteros distintos y muestre por pantalla el mayor de ellos
//suponemos que el operador del programa ingresa valores distintos

fun main() {

    val num1: Int
    val num2: Int

    print("\nIngrese el primer número: ")
    num1 = readLine()!!.toInt()
    print("\nIngrese el segundo número: ")
    num2 = readLine()!!.toInt()
    if(num1 > num2) {
        print("\nEl primer número es Mayor que el segundo número")
    } else {
        print("\nEl segundo número es Mayor que el primer número")
    }
    print("\nFin del Programa!!!\n")
}