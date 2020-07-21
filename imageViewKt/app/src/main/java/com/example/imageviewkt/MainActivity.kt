package com.example.imageviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_toast.setOnClickListener { //

            iv_profile.setImageResource(R.drawable.ai)
            Toast.makeText(this@MainActivity, "clicked", Toast.LENGTH_SHORT).show()

        }

    }
}