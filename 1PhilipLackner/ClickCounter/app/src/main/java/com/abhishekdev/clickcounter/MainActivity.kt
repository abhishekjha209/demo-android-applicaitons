package com.abhishekdev.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishekdev.clickcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Using View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var count = 0;
        binding.btnTap.setOnClickListener {
            count++;
            binding.tvCountDisplay.text = "Let's count together: ${count}"
        }

    }
}