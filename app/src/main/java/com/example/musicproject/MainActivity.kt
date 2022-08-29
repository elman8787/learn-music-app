package com.example.musicproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.animation.AlphaAnimation
import com.example.musicproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        alphaanimation1()
        alphaanimation3()
        binding.lessons.setOnClickListener {
            val intent = Intent(this,lessons::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener {
            val intent = Intent(this,aboutmaker::class.java)
            startActivity(intent)
        }
    }

    private fun alphaanimation3() {
        val anim = AlphaAnimation(0f,1f)
        anim.duration = 2000L
        binding.lessons.startAnimation(anim)
    }
    private fun alphaanimation1() {
        val anim = AlphaAnimation(0f,1f)
        anim.duration = 1000L
        binding.button.startAnimation(anim)
    }
}