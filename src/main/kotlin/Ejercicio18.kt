// +++++++++++++++++++++++++++++ Ejercicio 18 +++++++++++++++++++++++++++++
//Ingresar por teclado un valor entero. Almacenar en otra variable el cuadrado de dicho número si el valor ingresado es par,
//en caso que sea impar guardar el cubo. Mostrar además un mensaje que indique si se calcula el cuadrado o el cubo.
//  N % 2 ==0  ---> n*n  else n*n*n

fun main() {

    print("Ingrese un número entero: ")
    val num = readLine()!!.toInt()
    val result = if (num % 2 == 0) (num * num) else (num * num * num)
    println("\nEl resultado del número: $result ")

}