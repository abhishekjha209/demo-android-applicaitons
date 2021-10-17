package com.abhishekdev.radiobuttonandcheckboxes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.abhishekdev.radiobuttonandcheckboxes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnOrder.setOnClickListener {
            val checkedRbID = binding.rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedRbID)
            val ifCheese = binding.cbCheese.isChecked
            val ifOnion = binding.cbOnion.isChecked
            val ifSalad = binding.cbSalad.isChecked

            val orderString =   "You ordered a burger with: \n" +
                                "${meat.text}" +    
                                (if(ifCheese) "\nCheese" else "") +
                                (if(ifOnion) "\nOnions" else "") +
                                (if(ifSalad) "\nSalad" else "")

            binding.tvTest.text = orderString
        }
    }
}