package com.example.android.calculator

class StringCalculator {

    fun calculate(calculationList: List<String>): Int {

        var currentOpperation: String = ""
        var currentNumber = 0

        calculationList.forEach { token ->
            when{
                token.equals("+")
                        ||token.equals("/")
                        ||token.equals("*")
                        ||token.equals("-") -> currentOpperation = token

                currentOpperation.equals("-") -> currentNumber -= token.toInt()
                currentOpperation.equals("/") -> currentNumber /= token.toInt()
                currentOpperation.equals("*") -> currentNumber *= token.toInt()
                else -> currentNumber += token.toInt()

            }
        }

        return currentNumber
    }


}