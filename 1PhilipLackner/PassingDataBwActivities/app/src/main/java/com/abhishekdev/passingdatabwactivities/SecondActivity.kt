package com.abhishekdev.passingdatabwactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.abhishekdev.passingdatabwactivities.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("sec", "onCreate: ")
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val name = intent.getStringExtra("EXTRA_NAME")
//        val age = intent.getIntExtra("EXTRA_AGE",0) //default (for java compatibility)
//        val country = intent.getStringExtra("EXTRA_COUNTRY")

        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person
        binding.tvPerson.text = "${person.name} is ${person.age} years old and lives in ${person.country}";
    }
}