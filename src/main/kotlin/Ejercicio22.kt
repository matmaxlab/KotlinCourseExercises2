// +++++++++++++++++++++++++++++ Ejercicio 22 +++++++++++++++++++++++++++++
//Confeccionar un programa que lea por teclado tres números y nos muestre el mayor.

fun main() {

    print("\nIngrese el primer número: ")
    val num1 = readLine()!!.toInt()
    print("Ingrese el segundo número: ")
    val num2 = readLine()!!.toInt()
    print("Ingrese el tercer número: ")
    val num3 = readLine()!!.toInt()

    if((num1 > num2) && (num1 > num3)) {
        println("\nEl primer número es el Mayor!!!")
    } else{
        if((num2 > num1) && (num2 > num3)) {
            println("\nEl segundo número es el Mayor!!!")
        }else {
            println("\nEl tercer número es el Mayor!!!")
    }

    }

}