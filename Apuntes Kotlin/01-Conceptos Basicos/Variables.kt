fun main() {

    var numero :Int
    val letra = 'a'
    val frase = readln()
    
    /* Una variable la podremos declarar definiendo su tipo, o asignandole un valor ya sea mediante un readln
       o con un valor que le demos nosotros.

       ¿Var o Val?
       var -> crear una variable y poder cambiar su valor.
       val -> crear una variable constante y no se puede cambiar su valor
     */

   numero = readln().toInt()//Readln nos lee un String por lo que lo tenemos que pasar a Int poniendo toInt

    println("El numero es: $numero")
    println("La letra es: $letra")
    println(frase)

}