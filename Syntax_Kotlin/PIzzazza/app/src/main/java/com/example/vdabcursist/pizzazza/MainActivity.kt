package com.example.vdabcursist.pizzazza

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onPlaceOrderButtonClicked (view: View){
        var pizzaPrice = 0.0
        var totalToppings = 0

        when{
            radioButtonSmall.isChecked -> pizzaPrice = 5.0
            radioButtonMedium.isChecked -> pizzaPrice = 7.0
            radioButtonLarge.isChecked -> pizzaPrice = 9.0
        }

        if (checkBoxOnions.isChecked){totalToppings += 1}
        if (checkBoxAnsjovis.isChecked){totalToppings += 2}
        if (checkBoxOlives.isChecked){totalToppings += 3}
        result.text = "Total order price= "+(pizzaPrice+totalToppings)+" euro"
    }
}
