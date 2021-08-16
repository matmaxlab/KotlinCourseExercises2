//------------------------  Ejercicio Nro. 11 -------------------------------
//Escribir un programa en el cual se ingresen cuatro números enteros,
//calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.

fun main() {

    var num1: Int
    var num2: Int
    var num3: Int
    var num4: Int
    var sum: Int
    var prod: Int

    print("Ingrese el primer número: ")
    num1 = readLine()!!.toInt()
    print("\nIngrese el segundo número: ")
    num2 = readLine()!!.toInt()
    print("\nIngrese el tercer número: ")
    num3 = readLine()!!.toInt()
    print("\nIngrese el cuarto número: ")
    num4 = readLine()!!.toInt()

    sum = num1 + num2
    prod = num3 * num4

    print("\nEl resultado de la suma es = $sum")
    print("\nEl resultado del producto es = $prod \n")

}