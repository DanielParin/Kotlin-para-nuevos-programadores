fun main(){

    val array = IntArray(5) {0}
    val array2 = IntArray(5)//por defecto se inicializan a 0.


    /*
      Un array es un conjunto de valores del mismo tipo: String, Int, Double...
      En los arrays podemos poner val ya que eso solo impide la reeleccion de la longitud.
      Al poner IntArray, decimos que es un array de enteros. Ej: [1][2][3][4][5].
      (5) -> implica que el tamaño de el array es 5,es decir, 5 posiciones.
      {0} -> implica que las posiciones del array se inicializan a 0, es decir,[0][0][0][0][0]
     */

     for (i in array.indices){//.indices hace referencia a las posiciones/indices del array.La Primera posicion es la numero 0!!

         array[i]= readln().toInt()//para llenar un array lo hacemos por posicion.

     }

     for (i in array.indices){

         array2[i]=array[i]//trabajamos posicion a posicion

     }

    println(array2.joinToString())//Nos imprime el vector "bonito".
}