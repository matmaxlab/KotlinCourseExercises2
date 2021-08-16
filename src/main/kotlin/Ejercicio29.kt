// Ingresar un lote de 100 Alumnos donde se deben ingresar las calificaciones, sabiendo que cada alumno tiene 7 materias
// Por cada alumno se ingresa Nombre apellido, año en el que esta y sus 7 materias.
// Averiguar el promedio de nota de cada alumno.
// LEANDRO, 2, 7,8,7,9,10,6,8 = promedio
// LEANDRO, APELLIDO, 2do. Promedio 7,85

fun main() {


    var prom: Float

    for(i in 1..100){

        print("\nIngrese el nombre del alumno $i: ")                //Ingreso de nombre, apellido y curso por teclado
        val nombre: String = readLine()!!.toString()
        print("Ingrese el apellido del alumno $i: ")
        val apellido: String = readLine()!!.toString()
        print("Ingrese el año que cursa el alumno $i: ")
        val curso: String = readLine()!!.toString()
        var acu = 0                                                 //Inicializa el acumulador a cero

        for(j in 1..7){

            print("Ingrese la nota de la materia $j: ")             //Ingreso de las notas de las 7 materias
            val materia: Int = readLine()!!.toInt()
            acu += materia                                          //Acumula la sumatoria de las 7 materias

        }
        prom = (acu / 7).toFloat()                                  //Calcula el promedio por alumno
        print("\n$nombre, $apellido, $curso, Promedio $prom\n")     //Imprime el resultado para cada alumno
    }

    print("\nFin del programa!!!\n")

}