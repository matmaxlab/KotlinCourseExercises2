// Crear un Proyecto que se llame NUMEROS y el KT se llama ejer6
// Crear un programa que defina dos variables inmutables de tipo Int.
// Luego definir una tercer variable mutable que almacene la suma de las dos primeras variables y las muestre.
// Seguidamente almacenar en la variable el producto de las dos primeras variables y mostrar el resultado.

fun main(){

    val num1 : Int = 24
    val num2 : Int = 6
    var num3 : Int = 0

    num3 = num1 + num2
    print("La suma de "+ num1 + " + " + num2 + " es = " + num3)
    num3 = num1 * num2
    print("\nEl producto de " + num1 + " y " + num2 + " es = " + num3)

}