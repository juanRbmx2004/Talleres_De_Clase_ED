package Quiz

/*

ENTRADAS ---> Radio de la base del cilindro-->radio--->double
         ---> Altura del cilindro--->altura--->double

Salidas ----> Area lateral del cilindro--->Al--->double
        ----> Area total del cilindro---->At---->double
        ----> Volumen del cilindro---->V--->double
 */

import kotlin.math.*

fun MedidasCilindro(radio:Double,altura:Double):Triple<Double,Double,Double>{

    var Al = 2*PI*radio*altura
    var At = 2* PI*radio*altura+2*PI*radio*Math.pow(radio,2.0)
    var V = PI*Math.pow(radio,2.0)*altura
    return Triple(Al,At,V)
}

