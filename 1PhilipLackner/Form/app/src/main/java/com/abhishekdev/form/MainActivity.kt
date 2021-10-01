package com.abhishekdev.form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.abhishekdev.form.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //binding activity main
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnApply.setOnClickListener {
            var firstName = binding.etFirstName.text.toString()
            var lastName = binding.etLastName.text.toString()
            var birthDate = binding.etBirthDate.text.toString()
            var country = binding.etCountry.text.toString()

            Log.d("MainActivity", "$firstName $lastName,is from $country and was born on $birthDate")

        }
    }


};