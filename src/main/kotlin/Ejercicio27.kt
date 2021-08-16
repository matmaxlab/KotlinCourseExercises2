// Ejercicio Nro 27!!!!
/*
Ingresar un sueldo expresado en pesos, el mismo se determina de la siguiente forma
"Sueldo alto mayor a 26000"
"Sueldo medio mayor a 15000 y menor a 26000"
"Sueldo bajo menor a 15000"
Tener en cuenta que para el mayor sueldo se hace una retención del 15% y para el medio 10% mientras
que para el bajo no se hacen retenciones.
*/

fun main() {

    print("\nIngrese un sueldo en pesos: ")
    var sueldo: Float = readLine()!!.toFloat()

    if(sueldo > 26000){
        sueldo = (sueldo - (sueldo * 0.15)).toFloat()
        print("\nEl sueldo con la retención del 15% es de $ $sueldo => Es un sueldo Alto!!!\n")
    }else if(sueldo > 15000 && sueldo <= 26000){
        sueldo = (sueldo - (sueldo * 0.1)).toFloat()
        print("\nEl sueldo con la retención del 10% es de $ $sueldo => Es un sueldo Medio!!!\n")
    }else {
        print("\nEl sueldo No tiene retenciones y es de $ $sueldo => Es un sueldo Bajo!!!\n")
    }

}