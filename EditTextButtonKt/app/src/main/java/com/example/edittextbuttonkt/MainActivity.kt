package com.example.edittextbuttonkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_getText.setOnClickListener{ //에딧 텍스트에 입력되어 있는 값을 텍스트 뷰로 출력
            var resultText = et_id.text.toString() //에딧텍스트에 입력되어 있는 값
            tv_result.setText(resultText) // 입력된 값을 텍스트뷰에 set
        }

    }
}