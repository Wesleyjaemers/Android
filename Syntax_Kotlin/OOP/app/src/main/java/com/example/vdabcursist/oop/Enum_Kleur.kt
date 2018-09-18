package com.example.vdabcursist.oop

enum class Color (var rgb:Int, var kleurnaam: String, var nomdecouleur:String){
    RED(0xFF0000, "rood", "rouge"),
    GREEN(0xFF0000, "groen", "vert"),
    BLUE(0xFF0000, "blauw", "bleu")

}

fun main (args: Array<String>){

    println("NL: "+Color.RED.kleurnaam)
    println("FR: "+Color.RED.nomdecouleur)
}