fun main(){

    print("Inserte valor del primer operando: ")// print no te añade salto de linea, println te lo añade.
    val operando1 = readln().toDouble() //Double es un valor real decimal.
    print("Inserte valor del segundo operando: ")
    val operando2 = readln().toDouble()

    println("Elija operación:")
    println("1.Suma")
    println("2.Resta")
    println("3.Multiplicación")
    println("4.División")

    val respuesta= readln().toInt()
    var resultado = 0.0

    when(respuesta){

        1 -> resultado = operando1 + operando2
        2 ->resultado = operando1 - operando2
        3 ->resultado = operando1 * operando2
        4 ->resultado = operando1 / operando2

        else -> println("Operación no encontrada.")

    }
    println("El resultado es: $resultado")
}