package com.example.vdabcursist.oop


fun main (args: Array<String>){

    var myHashMap = HashMap<String, String>()
    myHashMap.put("OK", "Okay")
    myHashMap.put("Y", "Yes")

    for (x in myHashMap.keys){
        println(myHashMap.get(x))
    }
}