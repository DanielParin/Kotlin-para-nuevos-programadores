fun main(){

    val comprobacionDni = Regex("[0-9]{8}[A-Z]")
    var dniSinComprobar: String

    print("Inserte DNI: ")
    dniSinComprobar = readln()

    while (!comprobacionDni.matches(dniSinComprobar)){//Usamos esto para que haga lo del while si no coincide con la Regex
        print("DNI incorrecto, inserte uno valido: ")
        dniSinComprobar = readln()
    }

    println("Su DNI es: $dniSinComprobar")
}

/*
   Entenderemos una expresion regular (Regex) como un patron para verificar que la entrada es correcta.
   Hay infinidad de posibilidades con las regex, en este caso protegemos la entrada de valores que
   no tengan 8 numeros del 0 al 9 seguidos de una letra mayuscula de la A a la Z. Por lo que al salir del
   while estaremos muy seguros de que el valor de la variable es el que queremos.
 */