package com.example.vdabcursist.syntax

fun main (args:Array<String>){
    var age = 8
    val name = "Karel"
    var x:Char = 'x'
    var gender:Boolean = true

    var age2:Int = 22
    val pi = 3.1415f
    val myLong = 5L // zonder de L zou het een Int worden

    var myArray = arrayOf(2, 5, "Hello") // Elk datatype mag hier in gezet worden
    var myIntArray:Array<Int> = arrayOf(2, 4, 8) // Alleen Int mogelijk in deze Array
    var age3:Int? = null

    age3?.let{println ("age= $age3")} // null wordt niet geprint
    // age3!!.let{println ("age= $age3")} // Hier wordt er wel expliciet een exception gegooid
    age3 = 25
    age3?.let{println ("age= $age3")}

    var myIntArray2:Array<Int?> = arrayOf(2, null, 4, 8)

    for (item in myArray) {
        print(item)
    }
    println("Heeey DMG $name, wa ne leeftijd $age")
    println (myArray[1])

    println("Gelieve een naam in te geven")
    var inputName = readLine()
    println("Name $inputName")

    println("Gelieve uw leeftijd in te geven")
    var inputNumber = readLine()?.toInt() // Als het ? gebruikt wordt moet je dit blijven gebruiken. variabel kan de waarde null hebben
    inputNumber = inputNumber?.plus(1)
    inputNumber = inputNumber?.plus(2)
    println("Uw leeftijd is volgend jaar $inputNumber")

    println ("Gelieve een nummer in te voeren") // exception wordt gegooid als er niets (null) wordt ingegeven.
    var inputNumber2 = readLine()!!.toInt()
    inputNumber2 = inputNumber2+1
    println("nummer +1= $inputNumber2")
}