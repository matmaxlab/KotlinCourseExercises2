// ------------------------  Ejercicio  -------------------------------
// Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente.
//Mostrar lo que debe abonar el comprador.

fun main() {

    var precio: Float
    var cantidad: Int
    var total: Float
    print("Ingrese la cantidad del artículo que compra el cliente: ")
    cantidad = readLine()!!.toInt()
    print("\nIngrese el precio unitario del artículo: ")
    precio = readLine()!!.toFloat()
    total = cantidad * precio
    print("\nEl total de la compra es de: $ $total\n")
}