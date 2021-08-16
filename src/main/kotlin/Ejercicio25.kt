// Sale ejercicio 25
/*
Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10,
imprimir en pantalla la leyenda "Todos los números son menores a diez".
*/

fun main() {

    print("\nIngrese el primer número: ")
    val num1: Int = readLine()!!.toInt()
    print("Ingrese el segundo número: ")
    val num2: Int = readLine()!!.toInt()
    print("Ingrese el tercer número: ")
    val num3: Int = readLine()!!.toInt()

    if(num1 > 10 && num2 > 10 && num3 > 10){
        print("\nTodos los números son mayores a 10!!!\n")
    }else {
        println("\nEl primer número es: $num1")
        println("El segundo número es: $num2")
        println("El tercer número es: $num3\n")
    }
}