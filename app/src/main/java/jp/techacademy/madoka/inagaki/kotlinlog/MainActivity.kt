package jp.techacademy.madoka.inagaki.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("kotlintest","ログ出力テスト")

        var num = 10
        Log.d("kotlintest",Integer.toString(num))

        num = 50
        Log.d("kotlintest",num.toString())

        val num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest", "10 + 5 - 2 * 4 / 2  ="+ num1)

        val flag1 = true
        val flag2 =false
        Log.d("kotlintest","flag1 && flag2 = " + (flag1 && flag2))
        Log.d("kotlintest","flag1 || flag2 = " + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest","num2 < num3 = " + (num2 < num3))

        num = 60

        if (num >= 90){
            Log.d("kotlintest","優")
        }else if(num >= 75) {
            Log.d("kotlintest", "良")
        }else if(num >= 60){
            Log.d("kotlintest", "可")
        }else{
            Log.d("kotlintest", "不可")
        }

        val drink = 2

        when(drink){
            0-> Log.d("kotlintest", "コーヒー注文")
            1-> Log.d("kotlintest", "紅茶注文")
            2-> Log.d("kotlintest", "ミルク注文")
            else-> Log.d("kotlintest", "オーダーミスです")

        }

        for (i in 1 until 6){
            Log.d("kotlintest", "for文" + i + "回目")
        }

        var num4 = 1

        while (num4 < 6){
            Log.d("kotlintest", "while文" + num +"回目" )
            num4++
        }

        val points = arrayOf(10, 6, 15, 23, 17)

        for (i in points){
            Log.d("kotlintest", i.toString())
        }

        val numA = 100
        val numB = 0
        var ans = 0

        try{
            ans = numA / numB
        } catch (e :Exception) {
            Log.d("kotlintest", "0で割ろうとしました")
            // 例外情報から、メッセージを表示
            Log.d("kotlintest",e.message.toString())
        } finally {
            Log.d("kotlintest","ans = " + ans.toString())
        }

    }
}