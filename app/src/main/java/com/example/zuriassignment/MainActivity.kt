package com.example.zuriassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        creating an instance of counterTextView
        val counterTextView = findViewById<TextView>(R.id.counter_text_view)


        /*creating an instance of decrementButton
       then  setting on click event listener on the decrementButton*/
        val decrementButton = findViewById<Button>(R.id.decrement_button)
        decrementButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

//                operations to be performed when decrementButton is tabbed by
//                converting the value of textView toString then to int subtract 1 at each instance
                counterTextView.text = (counterTextView.text.toString().toInt() - 1).toString()

            }
        })

        /*creating an instance of incrementButton
      then  setting on click event listener on the incrementButton*/
        val incrementButton = findViewById<Button>(R.id.increment_button)
        incrementButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                //                operations to be performed when incrementButton is tabbed
                counterTextView.text = (counterTextView.text.toString().toInt() + 1).toString()

            }
        })
    }
}