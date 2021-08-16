// Sale con fritas el ejercicio 26!!! para la mesa 4!!!!
/*
Escribir un programa en el cual: dada una lista de tres valores enteros ingresados por teclado se guarde en
otras dos variables el menor y el mayor de esa lista. Utilizar el if como expresión para obtener el mayor y el menor.
Imprimir luego las dos variables.
*/

fun main() {

    print("\nIngrese el primer número entero: ")
    val num1: Int = readLine()!!.toInt()
    print("Ingrese el segundo número entero: ")
    val num2: Int = readLine()!!.toInt()
    print("Ingrese el tercer número entero: ")
    val num3: Int = readLine()!!.toInt()

    val mayor: Int
    val menor: Int

    if(num1 > num2 && num1 > num3){
        mayor = num1
    }else if(num2 > num1 && num2 > num3){
        mayor = num2
    }else {
        mayor = num3
    }

    print("\nEl número Mayor es: $mayor")

    if(num1 < num2 && num1 < num3){
        menor = num1
    }else if(num2 < num1 && num2 < num3){
        menor = num2
    }else {
        menor = num3
    }

    print("\nEl número Menor es: $menor\n")

}
