package com.example.essacz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun click1(view: View) {
        var displaytext : TextView = findViewById(R.id.textView1)
        displaytext.setText("Hello World")
    }
}