package com.abhishekdev.passingdatabwactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.abhishekdev.passingdatabwactivities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("fir", "onCreate: ")

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BtnApply.setOnClickListener {
            val name = binding.etName.text.toString()
            val age = binding.etAge.text.toString().toInt()
            val country = binding.etCountry.text.toString()

            // made an object of DATA CLASS
            val person = Person(name, age, country)

            Intent(this, SecondActivity::class.java).also {
//                it.putExtra("EXTRA_NAME", name)
//                it.putExtra("EXTRA_AGE", age)
//                it.putExtra("EXTRA_COUNTRY", country)

                it.putExtra("EXTRA_PERSON", person)
                startActivity(it)
            }

        }
    }
}