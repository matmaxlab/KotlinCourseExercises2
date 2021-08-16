// ------------------------  Ejercicio Nro. 12 -------------------------------
//Realizar un programa que lea por teclado cuatro valores numéricos enteros e informar su suma y promedio.

fun main() {

    var num1: Int
    var num2: Int
    var num3: Int
    var num4: Int
    var sum: Int
    var prom: Float

    print("Ingrese el primer número: ")
    num1 = readLine()!!.toInt()
    print("\nIngrese el segundo número: ")
    num2 = readLine()!!.toInt()
    print("\nIngrese el tercer número: ")
    num3 = readLine()!!.toInt()
    print("\nIngrese el cuarto número: ")
    num4 = readLine()!!.toInt()

    sum = num1 + num2 + num3 + num4
    prom = (sum / 4).toFloat()

    print("\nEl resultado de la suma es = $sum")
    print("\nEl resultado del promedio es = $prom \n")
}