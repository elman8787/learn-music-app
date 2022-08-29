package com.example.musicproject

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import com.example.musicproject.databinding.ActivityLesson2Binding

class lesson2 : AppCompatActivity() {
    lateinit var binding: ActivityLesson2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson2Binding.inflate(LayoutInflater.from(this))
        val intent = Intent(this, quiz2::class.java)
        val player = MediaPlayer.create(this, R.raw.horn)
        setContentView(binding.root)
        val yes = findViewById<Button>(R.id.yes)
        binding.imageView.setOnClickListener {
            val intent = Intent(this, lessons::class.java)
            startActivity(intent)
        }
        binding.quiz.setOnClickListener {
            binding.cardview.visibility = View.VISIBLE
        }
        yes.setOnClickListener {
            binding.button2.visibility = View.INVISIBLE
            binding.button4.visibility = View.INVISIBLE
            binding.button5.visibility = View.INVISIBLE
            binding.button6.visibility = View.INVISIBLE
            binding.button7.visibility = View.INVISIBLE
            binding.button8.visibility = View.INVISIBLE
            binding.button9.visibility = View.INVISIBLE
            binding.cardView.visibility = View.INVISIBLE
            binding.textView.visibility = View.INVISIBLE
            binding.textView4.visibility = View.INVISIBLE
            binding.s.visibility = View.INVISIBLE
            binding.quiz.visibility = View.INVISIBLE
            binding.cardview.visibility = View.INVISIBLE
            binding.textView3.visibility = View.VISIBLE
            val timer = object : CountDownTimer(4000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    binding.textView3.text = (millisUntilFinished / 1000).toString()
                }

                override fun onFinish() {
                    player.start()
                    startActivity(intent)
                }
            }
            timer.start()
        }
        binding.no.setOnClickListener {
            binding.cardview.visibility = View.INVISIBLE
        }
    }

    fun onclick(view: View) {
        val button: Button = view as Button
        val text = binding.textview.text.toString()
        val mylist = listOf<String>("do", "re", "mi", "fa", "sol", "la", "si")
        if (button.text.toString() == "دو" && text == "do") {
            binding.textview.text = mylist.random()
            val player = MediaPlayer.create(this, R.raw.correctanswer)
            player.start()
            visible()
        } else if (button.text.toString() == "ر" && text == "re") {
            binding.textview.text = mylist.random()
            val player = MediaPlayer.create(this, R.raw.correctanswer)
            player.start()
            visible()
        } else if (button.text.toString() == "می" && text == "mi") {
            visible()
            binding.textview.text = mylist.random()
            val player = MediaPlayer.create(this, R.raw.correctanswer)
            player.start()
        } else if (button.text.toString() == "فا" && text == "fa") {
            binding.textview.text = mylist.random()
            val player = MediaPlayer.create(this, R.raw.correctanswer)
            player.start()
            visible()
        } else if (button.text.toString() == "سل" && text == "sol") {
            binding.textview.text = mylist.random()
            val player = MediaPlayer.create(this, R.raw.correctanswer)
            player.start()
            visible()
        } else if (button.text.toString() == "لا" && text == "la") {
            binding.textview.text = mylist.random()
            val player = MediaPlayer.create(this, R.raw.correctanswer)
            player.start()
            visible()
        } else if (button.text.toString() == "سی" && text == "si") {
            binding.textview.text = mylist.random()
            val player = MediaPlayer.create(this, R.raw.correctanswer)
            player.start()
            visible()
        } else {
            button.visibility = View.INVISIBLE
            val player = MediaPlayer.create(this, R.raw.wronganswer)
            player.start()
        }
    }

    private fun visible() {
        binding.button2.visibility = View.VISIBLE
        binding.button4.visibility = View.VISIBLE
        binding.button5.visibility = View.VISIBLE
        binding.button6.visibility = View.VISIBLE
        binding.button7.visibility = View.VISIBLE
        binding.button8.visibility = View.VISIBLE
        binding.button9.visibility = View.VISIBLE
    }
}