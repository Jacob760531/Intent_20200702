package kr.co.tjoeun.intent_20200702

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//         세번째 엑티비티로 닉네임 변경하러 가자

        changeNickNameBtn.setOnClickListener {

            val myIntent = Intent(this,EditNickNameActivity::class.java)

//            결과를 가져오자
            startActivityForResult(myIntent,1000)

        }

//        두번째 엑티비티로 데이터 전달
        sendToSecondBtn.setOnClickListener {

            val inputMessage = messageEdt.text.toString()

            val inputNum = numberEdt.text.toString().toInt()

            val myIntent = Intent(this,SecondActivity::class.java)

            myIntent.putExtra("message",inputMessage)

            myIntent.putExtra("number",inputNum)

            startActivity(myIntent)
        }


        moveToFirstBtn.setOnClickListener {

//            Intent() = JAVA : new Intent() => 객체화
            val myIntent = Intent(this,FirstActivity::class.java)

            startActivity(myIntent)

        }
    }
}
