package com.example.vdabcursist.oop

interface Calculator{
    fun sum (num1: Int, num2: Int)
    fun div (num1: Int, num2: Int)
}

class Calculate: Calculator {

    override fun div(num1: Int, num2: Int) {
        var result= num1 - num2
        println("Het verschil van $num1 en $num2 is: $result")
    }

    override fun sum(num1: Int, num2: Int) {
        var result = num1 + num2
        println("De som van $num1 en $num2 is: $result")
    }
}

fun main (args: Array<String>){
    var myCalculation = Calculate ()
    myCalculation.sum(10, 16)
}