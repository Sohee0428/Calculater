package com.example.aop_part2_chapter04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {


    private val resultTxt: TextView by lazy {
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

    private val expressionTextView: TextView by lazy {
        findViewById<TextView>(R.id.expressionTxt)
    }

    private var isOperator = false
    private var hasOperator = false

    private fun numberButtonClicked(number: String) {

        if (isOperator) {
            expressionTextView.append(" ")
        }

        isOperator = false

        val expressionTxt = expressionTextView.text.split(" ")
        if (expressionTxt.isNotEmpty() && expressionTxt.last().length >= 15) {
            Toast.makeText(this, "15자리 까지만 사용할 수 있습니다.", Toast.LENGTH_SHORT).show()
            return
        } else if (expressionTxt.last().isEmpty() && number == "0") {
            Toast.makeText(this, "0은 제일 앞에 올 수 없습니다.", Toast.LENGTH_SHORT).show()
            return
        }

        expressionTextView.append(number)

//        TODO resultTxt 실시간으로 계산 결과를 넣어햐 하는 기능

        resultTxt.text = calculateExpression()
    }

    private fun operatorButtonClicked(operator: String) {

        if (expressionTextView.text.isEmpty()) {
            return
        }

        when {
            isOperator -> {
                val text = expressionTextView.text.toString()
                expressionTextView.text = text.dropLast(1) + operator
            }
            hasOperator -> {
                Toast.makeText(this, "연산자는 한 번만 사용할 수 있습니다.", Toast.LENGTH_SHORT).show()
                return
            }
            else -> {
                expressionTextView.append(" $operator")
            }
        }

        val ssb = SpannableStringBuilder(expressionTextView.text)
        ssb.setSpan(
            ForegroundColorSpan(getColor(R.color.green)),
            expressionTextView.text.length - 1,
            expressionTextView.text.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        expressionTextView.text = ssb

        isOperator = true
        hasOperator = true
    }



    fun resultButtonClicked(v: View) {

    }


    fun clearButtonClicked(v: View) {

    }

    fun historyButtonClicked(v: View) {

    }

}