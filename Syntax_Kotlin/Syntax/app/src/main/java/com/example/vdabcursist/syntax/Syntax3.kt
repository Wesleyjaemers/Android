package com.example.vdabcursist.syntax

fun main (args:Array<String>) {

    fun sum (x:Int, y:Int){
        var z = x+y
        println("Result: $z")
    }

    fun sumReturn (x:Int, y:Int):Int{  //datatype moet vermeld zijn als er een return wordt gedaan
        var z = x+y
        return z
    }
}