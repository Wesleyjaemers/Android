package com.example.vdabcursist.syntax

open class Artikel(){

    var name: String? =null
    var num: Int? =null
    var price: Double? =null

    constructor(name:String, num:Int, price:Double):this() {
        this.name = name
        this.num = num
        this.price = price
    }

    class Zuivel ():Artikel (){

        var days:Int? = null
        var deliveryCode:Char? = null

        constructor(days:Int, deliveryCode:Char, name:String, num:Int, price:Double):this() {
            this.days = days
            this.deliveryCode = deliveryCode
        }
    }
    fun main (args:Array<String>){

        var yoghurt = Zuivel(10, 'T', "Danone Aardbei", 15, 19.59)
    }

}