// Ingresar el sueldo en pesos e imprimir paga retenciones por ser mayor a 150.000 pesos

fun main() {

    val sueldo: Float

    print("\nIngrese un sueldo: ")
    sueldo = readLine()!!.toFloat()
    if(sueldo >= 150000) {
        print("\nPaga Retenciones!!!\n")
    }
}