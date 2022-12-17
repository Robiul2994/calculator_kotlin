package com.example.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var numberOne : EditText
    lateinit var numberTwo : EditText
    lateinit var addButton: Button
    lateinit var answerTv : TextView
    lateinit var subButton : Button
    lateinit var mulButton : Button
    lateinit var divButton : Button

    var numone = 0
    var numtwo = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberOne = findViewById(R.id.number1)
        numberTwo = findViewById(R.id.number2)
        addButton = findViewById(R.id.btn1)
        answerTv = findViewById(R.id.ans1)
        subButton = findViewById(R.id.btn2)
        mulButton = findViewById(R.id.btn3)
        divButton = findViewById(R.id.btn4)




        addButton.setOnClickListener(){
            if(numberOne.text.isNullOrBlank()||numberTwo.text.isNullOrBlank()) {
                answerTv.text="enter value please"
            }else{
                numone = numberOne.text.toString().toInt()
                numtwo = numberTwo.text.toString().toInt()



                answerTv.text = (numone + numtwo).toString()
            }
        }
        subButton.setOnClickListener(){
            if(numberOne.text.isNullOrBlank()||numberTwo.text.isNullOrBlank()) {
                answerTv.text="enter value please"
            }else{
                numone = numberOne.text.toString().toInt()
                numtwo = numberTwo.text.toString().toInt()



                answerTv.text = (numone - numtwo).toString()
            }
        }
        mulButton.setOnClickListener(){
            if(numberOne.text.isNullOrBlank()||numberTwo.text.isNullOrBlank()) {
                answerTv.text="enter value please"
            }else{
                numone = numberOne.text.toString().toInt()
                numtwo = numberTwo.text.toString().toInt()



                answerTv.text = (numone * numtwo).toString()
            }
        }
        divButton.setOnClickListener(){
            if(numberOne.text.isNullOrBlank()||numberTwo.text.isNullOrBlank()) {
                answerTv.text="enter value please"
            }else{
                numone = numberOne.text.toString().toInt()
                numtwo = numberTwo.text.toString().toInt()



                answerTv.text = (numone / numtwo).toString()
            }
        }
    }
}