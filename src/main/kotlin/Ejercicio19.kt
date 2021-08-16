// +++++++++++++++++++++++++++++ Ejercicio 19 +++++++++++++++++++++++++++++
// Cargar un valor entero por teclado comprendido entre 1 y 99. Almacenar en otra variable la cantidad de dígitos que
// tiene el valor ingresado por teclado. Mostrar la cantidad de dígitos del número ingresado por teclado.

fun main() {

    print("\nIngrese un numero entre 1 y 99: ")
    val num=readLine()!!.toInt()
    if (num<10) println("\nEl número es de 1 dígito!!!") else println("\nEl número es de 2 dígitos!!!")

}