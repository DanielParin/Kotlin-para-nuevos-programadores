fun main(){

    val matriz = Array(3){IntArray(3)}
    val matriz2 = Array(3){IntArray(3)}
    //misma metodologia que con los arrays, solo que aqui tenemos array de arrays de enteros:
    //[[1][2][3]] [[1][2][3]] [[1][2][3]]

    //para usar matrices, las usamos como si fuera un array pero con dos posiciones
    // i -> "fila"
    // j -> "columna"

    for (i in matriz.indices){
        for (j in matriz[0].indices){
            matriz[i][j]=readln().toInt()
        }
    }

    for (i in matriz.indices){
        for (j in matriz[0].indices){
            matriz2[i][j] = matriz[i][j]
        }
    }

    for (i in matriz2.indices){
        for (j in matriz2[0].indices){
            print("${matriz2[i][j]} ")//para imprimir el numero de la posicion mas un espacio
        }
        println()//para cambiar de linea al pasar a otro array de enteros/fila
    }

}