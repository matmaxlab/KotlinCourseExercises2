//  ------------------------  Ejercicio de Prueba ----------------------------
//Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo
//(El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro)

fun main() {

    var lado: Int
    var per: Int
    print("Ingrese la medida de uno de los lados del cuadrado:  ")
    lado = readLine()!!.toInt()
    per = lado * 4
    print("\nEl perímetro del cuadrado es = $per \n")

}