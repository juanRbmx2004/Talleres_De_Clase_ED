package Quiz

/*
Entradas --> Invesion-->C-->Double
         --> Tasa de interes--> i-->Double
         --> Años--> n-->Int

Salidas ---> Valor Presente ---> Vp--->Double

 */

fun EcuacionVp(C:Double,i:Double,n:Int):Double{

    var Vp = C/Math.pow((1+i),n.toDouble())

    return Vp
}