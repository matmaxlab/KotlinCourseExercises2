//ACA MANDO EL Siguiente EJ 24
//Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos valores enteros x e y.
//Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto.
//(1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, 3º Cuadrante: x < 0 Y y < 0, 4º Cuadrante: x > 0 Y y < 0)
//Si alguno o los dos valores son cero luego el punto se encuentra en un eje.

fun main() {

    print("\nIngrese la coordenada X: ")
    val x: Int = readLine()!!.toInt()
    print("Ingrese la coordenada Y: ")
    val y: Int = readLine()!!.toInt()

    if(x > 0 && y > 0){
        print("\nEstá en el 1° Cuadrante!!!\n")
    }else if(x < 0 && y > 0){
        print("\nEstá en el 2° Cuadrante!!!\n")
    }else if(x < 0 && y < 0){
        print("\nEstá en el 3° Cuadrante!!!\n")
    }else if(x > 0 && y < 0){
        print("\nEstá en el 4° Cuadrante!!!\n")
    }else if(x == 0 || y == 0){
        print("\nEstá en un eje!!!\n")
    }

}