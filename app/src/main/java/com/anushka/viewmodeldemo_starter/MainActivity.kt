package com.anushka.viewmodeldemo_starter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anushka.viewmodeldemo_starter.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.countText.text = (++count).toString()
        }
    }
}