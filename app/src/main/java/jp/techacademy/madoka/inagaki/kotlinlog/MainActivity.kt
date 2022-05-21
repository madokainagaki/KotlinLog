package jp.techacademy.madoka.inagaki.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        total(50,1000)

        val t = total(50, 1000)
        Log.d("kotelintest", t.toString())
    }


    private fun total(first: Int, last: Int): Int {
        var sum = 0
        for (i in first..last){
            sum +=1
        }

        return sum

    }


}