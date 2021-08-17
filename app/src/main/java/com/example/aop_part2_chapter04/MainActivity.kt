package com.example.aop_part2_chapter04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked(v: View) {
        when (v.id) {

            R.id.Btn0 -> numberButtonClicked("0")
            R.id.Btn1 -> numberButtonClicked("1")
            R.id.Btn2 -> numberButtonClicked("2")
            R.id.Btn3 -> numberButtonClicked("3")
            R.id.Btn4 -> numberButtonClicked("4")
            R.id.Btn5 -> numberButtonClicked("5")
            R.id.Btn6 -> numberButtonClicked("6")
            R.id.Btn7 -> numberButtonClicked("7")
            R.id.Btn8 -> numberButtonClicked("8")
            R.id.Btn9 -> numberButtonClicked("9")
            R.id.BtnPlus -> operatorButtonClicked("+")
            R.id.BtnMinus -> operatorButtonClicked("-")
            R.id.BtnMulti -> operatorButtonClicked("*")
            R.id.BtnDivider -> operatorButtonClicked("/")
            R.id.BtnModulo -> operatorButtonClicked("%")

        }

    }

    private fun numberButtonClicked(number: String) {

    }

    private fun operatorButtonClicked(operator: String) {

    }

    fun resultButtonClicked(v: View) {

    }


    fun clearButtonClicked(v: View) {

    }

    fun historyButtonClicked(v: View) {

    }

}