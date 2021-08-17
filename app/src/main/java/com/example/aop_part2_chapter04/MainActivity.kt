package com.example.aop_part2_chapter04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    private val resultTxt: TextView by lazy{
        findViewById<TextView>(R.id.resultTxt)
    }

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
    private val expressionTextView: TextView by lazy{
        findViewById<TextView>(R.id.expressionTxt)
    }


    private fun numberButtonClicked(number: String) {

        val expressionTxt = expressionTextView.text.split(" ")
        if(expressionTxt.isNotEmpty() && expressionTxt.last().length >= 15) {
            Toast.makeText(this, "15자리 까지만 사용할 수 있습니다.", Toast.LENGTH_SHORT).show()
            return
        }

        expressionTextView.append(number)

//        TODO resultTxt 실시간으로 계산 결과를 넣어햐 하는 기능
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