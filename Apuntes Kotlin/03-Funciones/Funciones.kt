fun main(){

    print("Inserte valor del primer operando: ")
    val operando1 = readln().toDouble()
    print("Inserte valor del segundo operando: ")
    val operando2 = readln().toDouble()

    var resultado=suma(operando1,operando2)
    println("El resultado de la suma es $resultado")
     resultado=resta(operando1,operando2)
    println("El resultado de la resta es $resultado")

}
fun suma(sumando1: Double,sumando2: Double): Double{//dentro de la funcion podemos cambiar el nombre de los parametros.

    var resultado: Double
    resultado = sumando1+sumando2

    return resultado
}
fun resta(sumando1: Double,sumando2: Double): Double{

    var resultado: Double
    resultado = sumando1-sumando2

    return resultado
}

/*
    A la hora de hacer una funcion tenemos que tener en cuenta 2 cosas, que le pasamos y si devuelve algo.

    INVOCAR FUNCION

    Puede pasar que no devuelva nada: nombreFuncion(x,y)
    O que devuelva algo: variable = nombreFuncion(x,y)

    FUNCION

    A la hora de programar la funcion tenemos que ver de que tipo son los parametros que nos pasan,
    en este caso nos pasan dos numeros que son Doubles, de ahi que pongamos:
        (sumando1: Double,sumando2: Double)
    Luego como hacemos que nos devuelva un valor la función, antes de abrir la llave del main de la funcion
    ponemos : y el tipo de dato que nos devuelve en este caso:
        ): Double{


    Dentro de la función funciona como un main normal pero dentro de la funcion solo, si queremos retornar
    un valor, lo pondremos con return x.
    En nuestro caso, la variable resultado del main recoge el valor que devuelve el return de la funcion.

 */