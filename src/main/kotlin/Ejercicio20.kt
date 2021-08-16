// +++++++++++++++++++++++++++++ Ejercicio 20 +++++++++++++++++++++++++++++
/* Nos piden realizar un programa donde se debe ingresar para un stock los siguientes ítems, código de producto,
nombre del producto, marca, precio de costo y cantidad en existencia. Se pide calcular e imprimir:

calcular el iva, (21%)
el neto, (precio de costo * utilidad)
utilidad según corresponda la ganancia para ese producto.
valor del producto total (precio de costo + utilidad +iva)
valor real del stock (valor del producto total * cantidad)
*/

fun main() {

    val iva : Float
    val neto : Float
    val util : Float
    val prodtot : Float
    val realstock : Float

    print("\nIngresar Código de Producto: ")
    val codprod = readLine()!!.toInt()
    print("Ingresar Nombre del Producto: ")
    val nomprod = readLine()!!.toString()
    print("Ingresar Marca del Producto: ")
    val marcprod = readLine()!!.toString()
    print("Ingresar Precio de Costo: ")
    val costo = readLine()!!.toFloat()
    print("Ingresar Porcentaje de Gananacia : ")
    val porutil = readLine()!!.toFloat()
    print("Ingresar Cantidad total en Existencia: ")
    val stock = readLine()!!.toInt()

    iva = (costo * 0.21).toFloat()
    util = (porutil * costo)/100
    neto = costo + util
    prodtot = costo + util + iva
    realstock = prodtot * stock

    println("\nProducto $nomprod con Código $codprod")
    println("Marca: $marcprod")
    println("Iva (21%) = $ $iva")
    println("Utilidad de $porutil % = $ $util")
    println("Precio Neto = $ $neto")
    println("Valor Total del Producto = $ $prodtot")
    println("Valor Real del Stock = $ $realstock")
    println("\nFin del Programa!!!\n")

}