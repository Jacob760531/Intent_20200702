package kr.co.tjoeun.intent_20200702

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        들어온 데이터를 받아서 텍스트뷰에 반영

        val receivedMessage = intent.getStringExtra("message")

        receivedMessageTxt.text = receivedMessage

        val recNum = intent.getIntExtra("number",-1)

//        numberTxt.text = "고유번호 : " + recNum.toString()

        numberTxt.text = "고유번호 : ${recNum}"






    }
}
