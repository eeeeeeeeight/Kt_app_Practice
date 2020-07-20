package com.example.intentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        if(intent.hasExtra("msg")) { //msg 라는 객체가 있다면
            tv_getMsg.text = intent.getStringExtra("msg") //서브 액티비티의 텍스트에 msg 내의 텍스트를 받아옴
        }

    }
}