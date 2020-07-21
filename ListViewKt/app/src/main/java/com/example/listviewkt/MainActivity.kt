package com.example.listviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
        User(R.drawable.android, "a", "1", "AAA"),
        User(R.drawable.android, "b", "2", "BBB"),
        User(R.drawable.android, "c", "3", "CCC"),
        User(R.drawable.android, "d", "4", "DDD"),
        User(R.drawable.android, "e", "5", "EEE"),
        User(R.drawable.android, "f", "6", "FFF"),
        User(R.drawable.android, "g", "7", "GGG")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ctrl + / -> 주석처리
//        val item = arrayOf("사과", "배", "딸기", "포도", "키위")
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

        val Adapter = UserAdapter(this, UserList)
        listView.adapter = Adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()
        }

    }
}