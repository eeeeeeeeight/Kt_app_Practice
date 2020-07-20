package com.example.textviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) { //앱 최초 실행 시 수행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //xml 화면 뷰를 연결. R=res=resource 디렉터리

        tv_title.setText("Hello World !") //텍스트의 값을 변경
    }
}