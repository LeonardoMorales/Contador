package com.leonardo.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var valorTotal = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fabAdd.setOnClickListener {
            if(isInputValid()) {
                valorTotal += textInputEditText.text.toString().toInt()
                textViewNumber.text = valorTotal.toString()
            }
        }

        fabMinus.setOnClickListener {
            if(isInputValid()) {
                valorTotal -= textInputEditText.text.toString().toInt()
                textViewNumber.text = valorTotal.toString()
            }
        }


    }

    private fun isInputValid(): Boolean {
        return if(textInputEditText.text.isNullOrBlank()){
            textInputLayout.error = "Digite un número antes de realizar una operación"
            false
        } else {
            textInputLayout.isErrorEnabled = false
            true
        }
    }
}
