// +++++++++++++++++++++++++++++ Ejercicio 21 +++++++++++++++++++++++++++++
/*Se carga una fecha (día, mes y año) por teclado en variables separadas.
Mostrar un mensaje si corresponde al primer trimestre del año (enero, febrero o marzo)
Cargar por teclado el valor numérico del día, mes y año. Ejemplo: dia:10 mes:2 año:2017.
*/

fun main() {

    print("\nIngresar día (en número): ")
    val dia = readLine()!!.toInt()
    print("Ingresar mes (en número): ")
    val mes = readLine()!!.toInt()
    print("Ingresar año: ")
    val anio = readLine()!!.toInt()

    if (mes == 1 || mes == 2 || mes == 3) {
        println("\nEl mes $mes Corresponde al Primer Trimestre del Año!!!")
    } else {
        println("\nEl mes $mes NO Corresponde al Primer Trimestre del Año!!!")
    }

    println("\nFin del Programa!!!\n")
}