package com.example.musicproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.animation.AlphaAnimation
import com.example.musicproject.databinding.ActivityLessonsBinding

class lessons : AppCompatActivity() {
    lateinit var binding:ActivityLessonsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonsBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        alphaanimation1()
        alphaanimation2()
        alphaanimation3()
        alphaanimation4()
        alphaanimation5()
        /*alphaanimation6()
        alphaanimation7()*/
        binding.b1.setOnClickListener {
            val intent = Intent(this,lesson1::class.java)
            startActivity(intent)
        }
        binding.b2.setOnClickListener {
            val intent = Intent(this,lesson2::class.java)
            startActivity(intent)
        }
        binding.b3.setOnClickListener {
            val intent = Intent(this,lesson3::class.java)
            startActivity(intent)
        }
        binding.b4.setOnClickListener {
            val intent = Intent(this,lesson4::class.java)
            startActivity(intent)
        }
        binding.b5.setOnClickListener {
            val intent = Intent(this,lesson5::class.java)
            startActivity(intent)
        }
    }

    /*private fun alphaanimation7() {
        val anim = AlphaAnimation(0f,1f)
        anim.duration = 1700L
        binding.l13.startAnimation(anim)
    }

    private fun alphaanimation6() {
        val anim = AlphaAnimation(0f,1f)
        anim.duration = 1500L
        binding.l6.startAnimation(anim)
    }*/

    private fun alphaanimation5() {
        val anim = AlphaAnimation(0f,1f)
        anim.duration = 1300L
        binding.b5.startAnimation(anim)
    }

    private fun alphaanimation4() {
        val anim = AlphaAnimation(0f,1f)
        anim.duration = 1100L
        binding.b4.startAnimation(anim)
    }

    private fun alphaanimation3() {
        val anim = AlphaAnimation(0f,1f)
        anim.duration = 900L
        binding.b3.startAnimation(anim)
    }

    private fun alphaanimation2() {
        val anim = AlphaAnimation(0f,1f)
        anim.duration = 700L
        binding.b2.startAnimation(anim)
    }

    private fun alphaanimation1() {
        val anim = AlphaAnimation(0f,1f)
        anim.duration = 500L
        binding.b1.startAnimation(anim)
    }
}