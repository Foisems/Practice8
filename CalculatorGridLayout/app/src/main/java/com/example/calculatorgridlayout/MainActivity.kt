package com.example.calculatorgridlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    var count: Byte? = null
    var num1: Double? = null
    var decimal = false

    fun btnClick(view: View) {
        var b1: Button? = null
        if (view is Button) {
            b1 = view as Button
        }
        val textView: TextView = findViewById(R.id.textView1)

        when (b1?.text) {
            "." ->{
                if (!decimal){
                    decimal = true
                    if (textView.text == "")
                        textView.text = "0."
                    else textView.text = textView.text.toString() + "."
                }
            }
            "0" -> {
                if (textView.text == "0") {
                    textView.text = "0.0"
                    decimal = true
                }
                else textView.text = textView.text.toString() + "0"
            }
            "1" -> {
                if (textView.text == "0"){
                    textView.text = "0.1"
                    decimal = true
                }
                else textView.text = textView.text.toString() + "1"
            }
            "2" -> {
                if (textView.text == "0"){
                    textView.text = "0.2"
                    decimal = true
                }
                else textView.text = textView.text.toString() + "2"
            }
            "3" -> {
                if (textView.text == "0"){
                    textView.text = "0.3"
                    decimal = true
                }
                else textView.text = textView.text.toString() + "3"
            }
            "4" -> {
                if (textView.text == "0"){
                    textView.text = "0.4"
                    decimal = true
                }
                else textView.text = textView.text.toString() + "4"
            }
            "5" -> {
                if (textView.text == "0"){
                    textView.text = "0.5"
                    decimal = true
                }
                else textView.text = textView.text.toString() + "5"
            }
            "6" -> {
                if (textView.text == "0"){
                    textView.text = "0.6"
                    decimal = true
                }
                else textView.text = textView.text.toString() + "6"
            }
            "7" -> {
                if (textView.text == "0"){
                    textView.text = "0.7"
                    decimal = true
                }
                else textView.text = textView.text.toString() + "7"
            }
            "8" -> {
                if (textView.text == "0"){
                    textView.text = "0.8"
                    decimal = true
                }
                else textView.text = textView.text.toString() + "8"
            }
            "9" -> {
                if (textView.text == "0"){
                    textView.text = "0.9"
                    decimal = true
                }
                else textView.text = textView.text.toString() + "9"
            }
            "C" -> {
                textView.text = ""
                decimal = false
            }
            "⇐" -> {
                try {
                textView.text = textView.text.substring(0, textView.text.toString().length - 1)
                }
                catch(e: Exception){
                    textView.text = e.message
                }
            }
            "=" -> {
                try {
                    val num2: Double = textView.text.toString().toDouble()
                    decimal = true
                    var res: Double? = null
                    when (count) {
                        1.toByte() -> res = (num1!! + num2)
                        2.toByte() -> res = (num1!! - num2)
                        3.toByte() -> res = (num1!! * num2)
                        4.toByte() -> res = (num1!! / num2)
                    }
                    textView.text =
                        if (res?.toInt()?.toDouble() == res) res?.toInt().toString()
                        else res.toString()
                }
                catch(e: Exception){
                    textView.text = e.message
                }
            }
        }
    }
    fun btnOperations(view: View) {
        var b1: Button? = null
        if (view is Button) {
            b1 = view as Button
        }
        val textView: TextView = findViewById(R.id.textView1)
        num1 = textView.text.toString().toDouble()
        textView.text = ""
        decimal = false

        when (b1?.text) {
            "+" -> count = 1
            "-" -> count = 2
            "*" -> count = 3
            "/" -> count = 4
        }
    }
}