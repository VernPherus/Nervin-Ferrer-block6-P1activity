
package com.ferrer.nervin.section.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ferrer.nervin.section.p1.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val msg = "Button_pressed"

        binding.button.setOnClickListener {
            binding.textView.text = msg;
        }

        setContentView(binding.root)
    }
}