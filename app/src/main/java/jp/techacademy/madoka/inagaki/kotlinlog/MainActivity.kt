package jp.techacademy.madoka.inagaki.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val human1= Human("ヤマダ太郎",35,"釣り")
        val human2= Woman("ヤマダ花子",65,"編み物")

        human1.say()
        human1.think()
        human2.say()
        human2.think()
    }
}