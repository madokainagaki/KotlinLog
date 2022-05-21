package jp.techacademy.madoka.inagaki.kotlinlog

import android.util.Log

class Woman : Human{
    constructor(name :String, age: Int, hobby :String): super(name, age, hobby) {
}

    override fun say(){
        super.say()
        Log.d("kotlintest","女性です")
    }

}