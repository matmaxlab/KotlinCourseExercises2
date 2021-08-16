// Ejercicio Nro. 28 ciclos finitos
// Ingresar 50 personas e ingresar su nombre apellido y edad
// Agregar un contador de edad para saber cuanto suma el total de las edades
// Ejemplo 20, 25,32

fun main() {

    var nombre: String
    var apellido: String
    var edad: Int = 0
    var acu: Int = 0

    for(i in 1..50) {

        print("\nIngrese el nombre de la persona $i: ")
        nombre = readLine()!!.toString()
        print("Ingrese el apellido de la persona $i: ")
        apellido = readLine()!!.toString()
        print("Ingrese la edad de la persona $i: ")
        edad = readLine()!!.toInt()
        acu += edad

    }

    print("\nEl total de las edades es: $acu\n")

}