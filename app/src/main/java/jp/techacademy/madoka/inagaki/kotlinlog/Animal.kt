package jp.techacademy.madoka.inagaki.kotlinlog

abstract class Animal {

    var name: String
    var age: Int

    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }

    abstract fun say()
}