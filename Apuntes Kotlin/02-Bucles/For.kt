fun main(){

    var resultado: Int

    print("Inserte valor de numero: ")
    val numero = readln().toInt()

    for (i in 1..10){ // desde que i vale 1 hasta que vale 10.

        resultado = numero * i
        println("$numero x $i = $resultado")
    }

}
/* El bucle for es un bucle definido por lo que sabemos cuando empieza y cuando acaba.
   Para el for se inicializa una variable que funcionará de "contador". En este caso es la i
   que en la primera iteración del bucle vale 1, en la segunda vale 2, .... hasta que en la última iteración
   valga 10. Irá tomando valores dependiendo del rango
   Por lo que dentro del for podemos hacer referencia a la variable contador que tendrá un valor progresivo.
*/