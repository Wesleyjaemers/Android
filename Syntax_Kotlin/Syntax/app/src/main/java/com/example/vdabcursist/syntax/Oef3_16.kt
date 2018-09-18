package com.example.vdabcursist.syntax

open class Student() {
    var name: String? = null
    var college: String? = null
    var age: Int? = null

    constructor(name: String, college: String, age: Int) : this() {
        this.name = name
        this.college = college
        this.age = age
    }
}
    class PostGraduateStudent (): Student() {
        var year: Int?=null
        constructor(year: Int) : this(){
        this.year = year
        }
    }

    fun main (args: Array<String>){
        var Post_Student = PostGraduateStudent()
        var Post_Student2 = PostGraduateStudent()
        Post_Student.name = "Jos"
        Post_Student.age = 15
        Post_Student.year = 2015
        println("Naam Post Graduate Student: "+Post_Student.name)
        println("Leeftijd student: "+Post_Student.age)
    }
