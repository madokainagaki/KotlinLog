package jp.techacademy.madoka.inagaki.kotlinlog

import android.util.Log

class Human :Animal {
    constructor(name :String, age: Int): super(name, age){
    }

    override fun say(){
        Log.d("kotlintest","私の名前は"+ this.name +"です。歳は"+ this.age +"歳です")
    }

}