package com.example.vdabcursist.syntax

fun main (args:Array<String>) {

    var age:Int = 22

    if (age<20)
        println("jonkie")
    else
        println("ouwe bok")
    println("Wordt altijd geprint")

    println("Geef een size op (1, 2, 3 of 4): ")
    var size = readLine()?.toInt()
    var price:Int? = null

    when(size){
        1,4->price=5
        2->price=10
        3->price=20
        else-> println("Verkeerd nummer ingegeven")
    }
    println("de prijs: $price")

    for (x in 0..5){
        println("x=$x")
    }

    /*var x = 1
    do {
        println(x)
        x++}
        while (x<5) */

    var y = 0
    do {
        y++
        if (y==4){continue}
        println(y)
    } while (y<5)
}