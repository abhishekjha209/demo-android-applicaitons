package com.abhishekdev.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishekdev.imageview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnInsert.setOnClickListener(){
            binding.ivScenery.setImageResource(R.drawable.ic_android)
        }

    }
}