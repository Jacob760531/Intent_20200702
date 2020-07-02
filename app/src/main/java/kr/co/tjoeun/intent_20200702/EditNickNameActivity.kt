package kr.co.tjoeun.intent_20200702

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nick_name.*

class EditNickNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)

        okBtn.setOnClickListener {

            val inputNick = nickNameEdt.text.toString()

//            복귀(finish) 하는 길에 데이터를 들고가게 해야함

//            왕복 Intent 는 출발/도착 기재 x
            val resultIntent = Intent()

//            복귀용 Intent에 데이터 첨부
            resultIntent.putExtra("nickName",inputNick)

//            완료를 눌렀다는 것을 명시 + 결과용 Intent도 첨부
            setResult(Activity.RESULT_OK,resultIntent)

//            모든 처리가 완료되면 종료
            finish()

        }
    }
}
