package kr.co.tjoeun.intent_20200702

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    닉네임 변경 요청 고유값을 멤버변수로 생성.
    val REQ_FOR_NICKNAME = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//         세번째 엑티비티로 닉네임 변경하러 가자

        changeNickNameBtn.setOnClickListener {

            val myIntent = Intent(this,EditNickNameActivity::class.java)

//            결과를 가져오자
            startActivityForResult(myIntent,REQ_FOR_NICKNAME)

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

// 결과를 가지고 돌아올때 실행되는 함수

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

//        어떤 결과를 가지러 다녀온건지 확인.

        if (requestCode == REQ_FOR_NICKNAME) {
//            완료로 돌아온게 맞는지 확인
            if (resultCode == Activity.RESULT_OK){

                val newNickname  = data?.getStringExtra("nickName")

//                텍스트뷰에 반영

                nickNameTxt.text = newNickname
            }

        }



    }
}
