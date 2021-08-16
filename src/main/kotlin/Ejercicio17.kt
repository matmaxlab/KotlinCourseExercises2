//PARA MAÑANA EJERCICIO 17
//Se ingresan por teclado 2 valores enteros. Si el primero es menor al segundo calcular la suma y la resta,
//luego mostrarlos, sino calcular el producto y la división.

fun main() {

    val num1: Float
    val num2: Float
    val suma: Float
    val resta: Float
    val multi: Float
    val divi: Float

    print("\nIngrese el primer número: ")
    num1 = readLine()!!.toFloat()
    print("Ingrese el segundo número: ")
    num2 = readLine()!!.toFloat()

    if(num1 < num2) {
        suma = num1 + num2
        resta = num1 - num2
        print("\n$num1 + $num2 = $suma")
        print("\n$num1 - $num2 = $resta \n")
    } else {
        multi = num1 * num2
        divi = num1 / num2
        print("\n$num1 * $num2 = $multi")
        print("\n$num1 / $num2 = $divi \n")
    }

    print("\nFin del Programa!!!\n")
}