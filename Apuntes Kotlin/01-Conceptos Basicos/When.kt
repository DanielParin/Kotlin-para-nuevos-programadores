fun main(){

    var respuesta: Int

    print("Inserte numero: ")
    respuesta = readln().toInt()

    when(respuesta){

        1 -> println("Has introducido 1.")
        2 -> println("Has introducido 2.")
        3 -> println("Has introducido 3.")
        else -> println("Has introducido un numero que no se analizar.")
    }
}
/* El when funcicona como una cadena de if-elseIf pero mas limpio (clean code).

   Dependiendo del valor de respuesta se hace lo que este asignado a ese valor, si respuesta es igual a 1,
   ejecuta lo asignado a 1 (println("Has introducido 1.")), si no se cumple ninguna condicion entrará al else.

 */