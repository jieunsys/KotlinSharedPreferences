package com.example.kotlinsharedpreferences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        idButton1.setOnClickListener {
            val pref = this.getSharedPreferences("temp1", Context.MODE_PRIVATE)
            pref.edit().putString("key1", idEdit1.text.toString()).apply()
        }

        idButton2.setOnClickListener {
            val pref = this.getSharedPreferences("temp1", Context.MODE_PRIVATE)
            val temp1 = pref.getString("key1", "저장된게 없네요")
            idEdit2.setText(temp1)
        }
    }
}