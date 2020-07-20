package com.example.intentkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_a.setOnClickListener { //

            val intent = Intent(this, SubActivity::class.java) //다음 화면으로 이동하기 위한 인텐트 객체 생성
            intent.putExtra("msg", tv_sendMsg.text.toString()) //텍스트 값을 담은 뒤 msg라고 명명
            startActivity(intent) // intent에 저장되어 있는 액티비티 쪽으로 이동
            finish() //자기 자신 액티비티(main)를 파괴
        }
    }
}