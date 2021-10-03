package com.abhishekdev.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.abhishekdev.toast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // generic toast popup.
        binding.btnShowToast.setOnClickListener{
            Toast.makeText(this, "This is a toast message!", Toast.LENGTH_LONG).show()
        }

    }
}