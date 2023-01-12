package com.thetapractice.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        summation()
        difference()
        multiply()
        divide()
        percentage()
    }

    private fun summation() {
        val edtFirstNumber: EditText = findViewById(R.id.FirstNumber)
        val edtSecondNumber: EditText = findViewById(R.id.SecondNumber)
        val txtResult: TextView = findViewById(R.id.Result)
        val add: Button = findViewById(R.id.Add)
        add.setOnClickListener() {
            val strFirstNumber = edtFirstNumber.text.toString()
            val strSecondNumber = edtSecondNumber.text.toString()
            if(strFirstNumber.isNotEmpty()&&strSecondNumber.isNotEmpty()) {
                val firstNumber = strFirstNumber.toDouble()
                val secondNumber = strSecondNumber.toDouble()
                val result = firstNumber + secondNumber
                txtResult.text = result.toString()
            }
            if(strFirstNumber.isEmpty())
            {
                edtFirstNumber.error = "Required"
            }
           if(strSecondNumber.isEmpty())
            {
                edtSecondNumber.error = "Required"
            }
        }
    }

    private fun difference() {
        val edtFirstNumber: EditText = findViewById(R.id.FirstNumber)
        val edtSecondNumber: EditText = findViewById(R.id.SecondNumber)
        val txtResult: TextView = findViewById(R.id.Result)
        val subtract: Button = findViewById(R.id.Subtract)
        subtract.setOnClickListener() {
            val strFirstNumber = edtFirstNumber.text.toString()
            val strSecondNumber = edtSecondNumber.text.toString()
            if(strFirstNumber.isNotEmpty()&&strSecondNumber.isNotEmpty()) {
                val firstNumber = strFirstNumber.toDouble()
                val secondNumber = strSecondNumber.toDouble()
                val result = firstNumber - secondNumber
                txtResult.text = result.toString()
            }
            if(strFirstNumber.isEmpty())
            {
                edtFirstNumber.error = "Required"
            }
            if(strSecondNumber.isEmpty())
            {
                edtSecondNumber.error = "Required"
            }
        }
    }

    private fun multiply() {
        val edtFirstNumber: EditText = findViewById(R.id.FirstNumber)
        val edtSecondNumber: EditText = findViewById(R.id.SecondNumber)
        val txtResult: TextView = findViewById(R.id.Result)
        val multiply: Button = findViewById(R.id.Multiply)
        multiply.setOnClickListener() {
            val strFirstNumber = edtFirstNumber.text.toString()
            val strSecondNumber = edtSecondNumber.text.toString()
            if(strFirstNumber.isNotEmpty()&&strSecondNumber.isNotEmpty()) {
                val firstNumber = strFirstNumber.toDouble()
                val secondNumber = strSecondNumber.toDouble()
                val result = firstNumber * secondNumber
                txtResult.text = result.toString()
            }
            if(strFirstNumber.isEmpty())
            {
                edtFirstNumber.error = "Required"
            }
            if(strSecondNumber.isEmpty())
            {
                edtSecondNumber.error = "Required"
            }
        }
    }

    private fun divide() {
        val edtFirstNumber: EditText = findViewById(R.id.FirstNumber)
        val edtSecondNumber: EditText = findViewById(R.id.SecondNumber)
        val txtResult: TextView = findViewById(R.id.Result)
        val divide: Button = findViewById(R.id.Divide)
        divide.setOnClickListener() {
            val strFirstNumber = edtFirstNumber.text.toString()
            val strSecondNumber = edtSecondNumber.text.toString()
            if(strFirstNumber.isNotEmpty()&&strSecondNumber.isNotEmpty()) {
                val firstNumber = strFirstNumber.toDouble()
                val secondNumber = strSecondNumber.toDouble()
                val result = firstNumber / secondNumber
                txtResult.text = result.toString()
            }
            if(strFirstNumber.isEmpty())
            {
                edtFirstNumber.error = "Required"
            }
            if(strSecondNumber.isEmpty())
            {
                edtSecondNumber.error = "Required"
            }
        }
    }

    private fun percentage() {
        val edtFirstNumber: EditText = findViewById(R.id.FirstNumber)
        val edtSecondNumber: EditText = findViewById(R.id.SecondNumber)
        val txtResult: TextView = findViewById(R.id.Result)
        val percentage: Button = findViewById(R.id.Percentage)
        percentage.setOnClickListener() {
            val strFirstNumber = edtFirstNumber.text.toString()
            val strSecondNumber = edtSecondNumber.text.toString()
            if(strFirstNumber.isNotEmpty()&&strSecondNumber.isNotEmpty()) {
                val firstNumber = strFirstNumber.toDouble()
                val secondNumber = strSecondNumber.toDouble()
                val result = (firstNumber / secondNumber) * 100
                txtResult.text = result.toString()
            }
            if(strFirstNumber.isEmpty())
            {
                edtFirstNumber.error = "Required"
            }
            if(strSecondNumber.isEmpty())
            {
                edtSecondNumber.error = "Required"
            }
        }
    }
}