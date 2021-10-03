package com.abhishekdev.calculatesum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishekdev.calculatesum.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // declare layout binding
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSum.setOnClickListener {
            var fNum = binding.etFirstNumber.text.toString().toInt()
            var sNum = binding.etSecNumber.text.toString().toInt()
            var sum: Int = fNum + sNum;

            binding.tvResult.text = sum.toString();

        }
    }
}