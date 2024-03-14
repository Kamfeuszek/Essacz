package com.example.essacz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var expression:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        expression = findViewById(R.id.textView1)

    }
    private fun expressionText(str:String) {
        expression.text = str
    }

    fun buttonc(view: View) {
        expression.setText("")
    }
    fun button0(view: View) {
        val str = expression.text.toString() + "0"
        expressionText(str)
    }
    fun button1(view: View) {
        val str = expression.text.toString() + "1"
        expressionText(str)
    }
    fun button2(view: View) {
        val str = expression.text.toString() + "2"
        expressionText(str)
    }
    fun button3(view: View) {
        val str = expression.text.toString() + "3"
        expressionText(str)
    }
    fun button4(view: View) {
        val str = expression.text.toString() + "4"
        expressionText(str)
    }
    fun button5(view: View) {
        val str = expression.text.toString() + "5"
        expressionText(str)
    }
    fun button6(view: View) {
        val str = expression.text.toString() + "6"
        expressionText(str)
    }
    fun button7(view: View) {
        val str = expression.text.toString() + "7"
        expressionText(str)
    }
    fun button8(view: View) {
        val str = expression.text.toString() + "8"
        expressionText(str)
    }
    fun button9(view: View) {
        val str = expression.text.toString() + "9"
        expressionText(str)
    }
    fun button11(view: View) {
        val str = expression.text.toString() + "+"
        expressionText(str)
    }
    fun button12(view: View) {
        val str = expression.text.toString() + "-"
        expressionText(str)
    }
    fun button13(view: View) {
        val str = expression.text.toString() + "*"
        expressionText(str)
    }
    fun button14(view: View) {
        val str = expression.text.toString() + "/"
        expressionText(str)
    }
    fun button15(view: View) {
        val str = expression.text.toString() + "="
        expressionText(str)
    }

}