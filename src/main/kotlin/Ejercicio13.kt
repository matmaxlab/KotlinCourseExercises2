// ------------------------  Ejercicio Nro. 13 -------------------------------
//Ingresar el diametro de un circulo y calcular su perimetro e imprimirlo.  (PI 3,141651.... Double

fun main() {

    val diam: Float
    val per: Double

    print("Ingrese el diámetro de un circulo: ")
    diam = readLine()!!.toFloat()

    per = diam * Math.PI

    print("\nEl perímetro del círculo es = $per \n")
}