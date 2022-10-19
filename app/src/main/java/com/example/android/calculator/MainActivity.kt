package com.example.android.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val operationList: MutableList<String> = arrayListOf()
    val numberCache: MutableList<String> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        updateDisplay("")
    }

    fun makeString(list: List<String>, joiner: String = ""): String{

        if(list.isEmpty()) return ""
        return list.reduce {r, s -> r + joiner + s}

    }

    fun updateDisplay(mainDisplayString: String) {

        val fullCalculationString = makeString(operationList, " ")
        val fullCalculationTextView = findViewById(R.id.calculatedText) as TextView
        fullCalculationTextView.text = fullCalculationString

        val mainTextView = findViewById(R.id.textView) as TextView
        mainTextView.text = mainDisplayString

    }

    fun clearCache(){
        numberCache.clear()
        operationList.clear()
    }

    fun onClickClear(view: View){
        clearCache()
        updateDisplay("")
    }

   fun onClickEquals(view: View){
       operationList.add(makeString(numberCache))
       numberCache.clear()

       val calculator = StringCalculator()
       val answer = calculator.calculate(operationList)

       updateDisplay("=" + answer.toString())
       clearCache()
    }
}