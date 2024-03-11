package com.example.essacz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var expression:TextView
    private lateinit var equal:Button
    private lateinit var add:Button
    private lateinit var substract:Button
    private lateinit var multiply:Button
    private lateinit var divide:Button
    private lateinit var one:Button
    private lateinit var two:Button
    private lateinit var three:Button
    private lateinit var four:Button
    private lateinit var five:Button
    private lateinit var six:Button
    private lateinit var seven:Button
    private lateinit var eight:Button
    private lateinit var nine:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        expression = findViewById(R.id.textView1)
        equal = findViewById(R.id.button15)
        add = findViewById(R.id.button11)
        substract = findViewById(R.id.button12)
        multiply = findViewById(R.id.button13)
        divide = findViewById(R.id.button14)
        one = findViewById(R.id.button)
        two = findViewById(R.id.button2)
        three = findViewById(R.id.button3)
        four = findViewById(R.id.button4)
        five = findViewById(R.id.button5)
        six = findViewById(R.id.button6)
        seven = findViewById(R.id.button7)
        eight = findViewById(R.id.button8)
        nine = findViewById(R.id.button9)

        expression.isActivated = true
        expression.isPressed = true

    var str:String
    }
    fun buttonc(view: View) {
        var displaytext: TextView = findViewById(R.id.textView1)
        displaytext.setText("")
    }
    fun button1(view: View) {
        var str = expression.text.toString() + "1"
        expressionText(str)
    }
    fun button2(view: View) {
        var str = expression.text.toString() + "2"
        expressionText(str)
    }
    fun button3(view: View) {
        var str = expression.text.toString() + "3"
        expressionText(str)
    }
    fun button4(view: View) {
        var str = expression.text.toString() + "4"
        expressionText(str)
    }
    fun button5(view: View) {
        var str = expression.text.toString() + "5"
        expressionText(str)
    }
    fun button6(view: View) {
        var str = expression.text.toString() + "6"
        expressionText(str)
    }
    fun button7(view: View) {
        var str = expression.text.toString() + "7"
        expressionText(str)
    }
    fun button8(view: View) {
        var str = expression.text.toString() + "8"
        expressionText(str)
    }
    fun button9(view: View) {
        var str = expression.text.toString() + "9"
        expressionText(str)
    }
    fun button11(view: View) {
        var str = expression.text.toString() + "+"
        expressionText(str)
    }
    fun button12(view: View) {
        var str = expression.text.toString() + "-"
        expressionText(str)
    }
    fun button13(view: View) {
        var str = expression.text.toString() + "*"
        expressionText(str)
    }
    fun button14(view: View) {
        var str = expression.text.toString() + "/"
        expressionText(str)
    }
    private fun expressionText(str:String) {
        expression.text = str
    }
}