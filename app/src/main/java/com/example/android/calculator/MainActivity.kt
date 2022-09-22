package com.example.android.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    val operationList: MutableList<String> = arrayListOf()
    val numberCache: MutableList<String> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        updateDisplay("")
    }



    fun updateDisplay(mainString: String) {
    }

    fun clearCache(){
        numberCache.clear()
        operationList.clear()
    }

    fun clear(view: View){
        clearCache()
        updateDisplay("")
    }
}