package com.example.young_dev_internship_project1_calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){

    private lateinit var editTextNum1: EditText
    private lateinit var editTextNum2: EditText
    private lateinit var answerText: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNum1 = findViewById(R.id.edittextnum1)
        editTextNum2 = findViewById(R.id.edittextnum2)
        answerText = findViewById(R.id.answertext)
        val additionBtn = findViewById<Button>(R.id.additionbtn)
        val subtractionBtn = findViewById<Button>(R.id.subtractbtn)
        val multiplicationBtn = findViewById<Button>(R.id.multiplybtn)
        val divisionBtn = findViewById<Button>(R.id.divsionbtn)

//        additionBtn.setOnClickListener(View.OnClickListener {
//
//        })



    }
    fun  Add(v:View) {
        var num1 :Double = editTextNum1.getText().toString().toDouble()
        var num2 :Double = editTextNum2.getText().toString().toDouble()
        var result: Double = num1 + num2
        answerText.setText("Total value:" + result)
    }
    fun  Subtract(v:View) {
        var num1 :Double = editTextNum1.getText().toString().toDouble()
        var num2 :Double = editTextNum2.getText().toString().toDouble()
        var result: Double = num1 - num2
        answerText.setText("Subtract value:" + result)
    }
    fun  Divide(v:View) {
        var num1 :Double = editTextNum1.getText().toString().toDouble()
        var num2 :Double = editTextNum2.getText().toString().toDouble()

        var result: Double = num1 / num2
        if (num1 == 0.toDouble() || num2 == 0.toDouble()) {
            answerText.setText("Divide value:" + "SYNTAX ERROR")
        }

        else{
            answerText.setText("Divide value:"+ result)
        }

    }
    fun  Multiply(v:View) {
        var num1 :Double = editTextNum1.getText().toString().toDouble()
        var num2 :Double = editTextNum2.getText().toString().toDouble()
        var result: Double = num1 * num2
        answerText.setText("Multiply value:" + result)
    }

}






