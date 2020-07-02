package kr.co.tjoeun.intent_20200702

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        두번째 엑티비티로 데이터 전달
        sendToSecondBtn.setOnClickListener {

            val inputMessage = messageEdt.text.toString()

            val myIntent = Intent(this,SecondActivity::class.java)

            myIntent.putExtra("message",inputMessage)

            startActivity(myIntent)
        }


        moveToFirstBtn.setOnClickListener {

//            Intent() = JAVA : new Intent() => 객체화
            val myIntent = Intent(this,FirstActivity::class.java)

            startActivity(myIntent)

        }
    }
}
