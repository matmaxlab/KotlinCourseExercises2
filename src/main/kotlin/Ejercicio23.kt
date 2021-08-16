/* //Ejercicio 23
// Pasar un numero ingresado por valor numerico a valor texto esto requiere que sea de 2 cifras maximo. 0 hasta 99
// Ejemplo
34 -> Treinta y cuatro
79 -> Setenta y nueve
6 -> Seis */

fun main() {

    print("\nIngrese un número entero del 0 al 99: ")
    val num: Int = readLine()!!.toInt()
    val partent: Int = num / 10
    val pardec: Int = num%10

    if(num == 0){
        print("\n$num => Cero\n")
    }else if(num == 1){
        print("\n$num => Uno\n")
    }else if(num == 2){
        print("\n$num => Dos\n")
    }else if(num == 3){
        print("\n$num => Tres\n")
    }else if(num == 4){
        print("\n$num => Cuatro\n")
    }else if(num == 5){
        print("\n$num => Cinco\n")
    }else if(num == 6){
        print("\n$num => Seis\n")
    }else if(num == 7){
        print("\n$num => Siete\n")
    }else if(num == 8){
        print("\n$num => Ocho\n")
    }else if(num == 9){
        print("\n$num => Nueve\n")
    }else if(pardec == 0 && partent == 1){
        print("\n$num => Diez\n")
    }else if(pardec == 1 && partent == 1){
        print("\n$num => Once\n")
    }else if(pardec == 2  && partent == 1){
        print("\n$num => Doce\n")
    }else if(pardec == 3  && partent == 1){
        print("\n$num => Trece\n")
    }else if(pardec == 4  && partent == 1){
        print("\n$num => Catorce\n")
    }else if(pardec == 5  && partent == 1){
        print("\n$num => Quince\n")
    }else if(pardec == 6  && partent == 1){
        print("\n$num => Dieciseis\n")
    }else if(pardec == 7  && partent == 1){
        print("\n$num => Diecisiete\n")
    }else if(pardec == 8  && partent == 1){
        print("\n$num => Dieciocho\n")
    }else if(pardec == 9  && partent == 1){
        print("\n$num => Diecinueve\n")
    }else if(pardec == 0 && partent == 2){
        print("\n$num => Veinte\n")
    }else if(pardec == 1 && partent == 2){
        print("\n$num => Veintiuno\n")
    }else if(pardec == 2 && partent == 2){
        print("\n$num => Veintidos\n")
    }else if(pardec == 3 && partent == 2){
        print("\n$num => Veintitres\n")
    }else if(pardec == 4 && partent == 2){
        print("\n$num => Veinticuatro\n")
    }else if(pardec == 5 && partent == 2){
        print("\n$num => Veinticinco\n")
    }else if(pardec == 6 && partent == 2){
        print("\n$num => Veintiseis\n")
    }else if(pardec == 7 && partent == 2){
        print("\n$num => Veintisiete\n")
    }else if(pardec == 8 && partent == 2){
        print("\n$num => Veintiocho\n")
    }else if(pardec == 9 && partent == 2){
        print("\n$num => Veintinueve\n")
    }else if(pardec == 0 && partent == 3){
        print("\n$num => Treinta\n")
    }else if(pardec == 1 && partent == 3){
        print("\n$num => Treinta y uno\n")
    }else if(pardec == 2 && partent == 3){
        print("\n$num => Treinta y dos\n")
    }else if(pardec == 3 && partent == 3){
        print("\n$num => Treinta y tres\n")
    }else if(pardec == 4 && partent == 3){
        print("\n$num => Treinta y cuatro\n")
    }else if(pardec == 5 && partent == 3){
        print("\n$num => Treinta y cinco\n")
    }else if(pardec == 6 && partent == 3){
        print("\n$num => Treinta y seis\n")
    }else if(pardec == 7 && partent == 3){
        print("\n$num => Treinta y siete\n")
    }else if(pardec == 8 && partent == 3){
        print("\n$num => Treinta y ocho\n")
    }else if(pardec == 9 && partent == 3){
        print("\n$num => Treinta y nueve\n")
    }else if(pardec == 0 && partent == 4){
        print("\n$num => Cuarenta\n")
    }else if(pardec == 1 && partent == 4){
        print("\n$num => Cuarenta y uno\n")
    }else if(pardec == 2 && partent == 4){
        print("\n$num => Cuarenta y dos\n")
    }else if(pardec == 3 && partent == 4){
        print("\n$num => Cuarenta y tres\n")
    }else if(pardec == 4 && partent == 4){
        print("\n$num => Cuarenta y cuatro\n")
    }else if(pardec == 5 && partent == 4){
        print("\n$num => Cuarenta y cinco\n")
    }else if(pardec == 6 && partent == 4){
        print("\n$num => Cuarenta y seis\n")
    }else if(pardec == 7 && partent == 4){
        print("\n$num => Cuarenta y siete\n")
    }else if(pardec == 8 && partent == 4){
        print("\n$num => Cuarenta y ocho\n")
    }else if(pardec == 9 && partent == 4){
        print("\n$num => Cuarenta y nueve\n")
    }else if(pardec == 0 && partent == 5){
        print("\n$num => Cincuenta\n")
    }else if(pardec == 1 && partent == 5){
        print("\n$num => Cincuenta y uno\n")
    }else if(pardec == 2 && partent == 5){
        print("\n$num => Cincuenta y dos\n")
    }else if(pardec == 3 && partent == 5){
        print("\n$num => Cincuenta y tres\n")
    }else if(pardec == 4 && partent == 5){
        print("\n$num => Cincuenta y cuatro\n")
    }else if(pardec == 5 && partent == 5){
        print("\n$num => Cincuenta y cinco\n")
    }else if(pardec == 6 && partent == 5){
        print("\n$num => Cincuenta y seis\n")
    }else if(pardec == 7 && partent == 5){
        print("\n$num => Cincuenta y siete\n")
    }else if(pardec == 8 && partent == 5){
        print("\n$num => Cincuenta y ocho\n")
    }else if(pardec == 9 && partent == 5){
        print("\n$num => Cincuenta y nueve\n")
    }else if(pardec == 0 && partent == 6){
        print("\n$num => Sesenta\n")
    }else if(pardec == 1 && partent == 6){
        print("\n$num => Sesenta y uno\n")
    }else if(pardec == 2 && partent == 6){
        print("\n$num => Sesenta y dos\n")
    }else if(pardec == 3 && partent == 6){
        print("\n$num => Sesenta y tres\n")
    }else if(pardec == 4 && partent == 6){
        print("\n$num => Sesenta y cuatro\n")
    }else if(pardec == 5 && partent == 6){
        print("\n$num => Sesenta y cinco\n")
    }else if(pardec == 6 && partent == 6){
        print("\n$num => Sesenta y seis\n")
    }else if(pardec == 7 && partent == 6){
        print("\n$num => Sesenta y siete\n")
    }else if(pardec == 8 && partent == 6){
        print("\n$num => Sesenta y ocho\n")
    }else if(pardec == 9 && partent == 6){
        print("\n$num => Sesenta y nueve\n")
    }else if(pardec == 0 && partent == 7){
        print("\n$num => Setenta\n")
    }else if(pardec == 1 && partent == 7){
        print("\n$num => Setenta y uno\n")
    }else if(pardec == 2 && partent == 7){
        print("\n$num => Setenta y dos\n")
    }else if(pardec == 3 && partent == 7){
        print("\n$num => Setenta y tres\n")
    }else if(pardec == 4 && partent == 7){
        print("\n$num => Setenta y cuatro\n")
    }else if(pardec == 5 && partent == 7){
        print("\n$num => Setenta y cinco\n")
    }else if(pardec == 6 && partent == 7){
        print("\n$num => Setenta y seis\n")
    }else if(pardec == 7 && partent == 7){
        print("\n$num => Setenta y siete\n")
    }else if(pardec == 8 && partent == 7){
        print("\n$num => Setenta y ocho\n")
    }else if(pardec == 9 && partent == 7){
        print("\n$num => Setenta y nueve\n")
    }else if(pardec == 0 && partent == 8){
        print("\n$num => Ochenta\n")
    }else if(pardec == 1 && partent == 8){
        print("\n$num => Ochenta\n")
    }else if(pardec == 2 && partent == 8){
        print("\n$num => Ochenta y uno\n")
    }else if(pardec == 3 && partent == 8){
        print("\n$num => Ochenta y dos\n")
    }else if(pardec == 4 && partent == 8){
        print("\n$num => Ochenta y tres\n")
    }else if(pardec == 5 && partent == 8){
        print("\n$num => Ochenta y cuatro\n")
    }else if(pardec == 6 && partent == 8){
        print("\n$num => Ochenta y cinco\n")
    }else if(pardec == 7 && partent == 8){
        print("\n$num => Ochenta y siete\n")
    }else if(pardec == 8 && partent == 8){
        print("\n$num => Ochenta y ocho\n")
    }else if(pardec == 9 && partent == 8){
        print("\n$num => Ochenta y nueve\n")
    }else if(pardec == 0 && partent == 9){
        print("\n$num => Noventa\n")
    }else if(pardec == 1 && partent == 9){
        print("\n$num => Noventa y uno\n")
    }else if(pardec == 2 && partent == 9){
        print("\n$num => Noventa y dos\n")
    }else if(pardec == 3 && partent == 9){
        print("\n$num => Noventa y tres\n")
    }else if(pardec == 4 && partent == 9){
        print("\n$num => Noventa y cuatro\n")
    }else if(pardec == 5 && partent == 9){
        print("\n$num => Noventa y cinco\n")
    }else if(pardec == 6 && partent == 9){
        print("\n$num => Noventa y seis\n")
    }else if(pardec == 7 && partent == 9){
        print("\n$num => Noventa y siete\n")
    }else if(pardec == 8 && partent == 9){
        print("\n$num => Noventa y ocho\n")
    }else if(pardec == 9 && partent == 9){
        print("\n$num => Noventa y nueve\n")
    }

}