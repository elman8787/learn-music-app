package com.example.musicproject

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import com.example.musicproject.databinding.ActivityLesson1Binding
import android.media.MediaPlayer.create as create1

class lesson1 : AppCompatActivity() {
    lateinit var binding: ActivityLesson1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson1Binding.inflate(LayoutInflater.from(this))
        val intent = Intent(this,quiz1::class.java)
        val player = MediaPlayer.create(this,R.raw.horn)
        setContentView(binding.root)
        val yes = findViewById<Button>(R.id.yes)
        binding.imageView.setOnClickListener {
            val intent = Intent(this,lessons::class.java)
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
            val timer = object : CountDownTimer(4000,1000) {
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
        val mylist = listOf<String>("دو", "ر", "می", "فا", "سل", "لا", "سی")
        if (button.text.toString() == "do" && text == "دو") {
            binding.textview.text = mylist.random()
            val player = create1(this,R.raw.correctanswer)
            player.start()
            visible()
        }
        else if (button.text.toString() == "re" && text == "ر") {
            binding.textview.text = mylist.random()
            val player = create1(this,R.raw.correctanswer)
            player.start()
            visible()
        } else if (button.text.toString() == "mi" && text == "می") {
            visible()
            binding.textview.text = mylist.random()
            val player = create1(this,R.raw.correctanswer)
            player.start()
        } else if (button.text.toString() == "fa" && text == "فا") {
            binding.textview.text = mylist.random()
            val player = create1(this,R.raw.correctanswer)
            player.start()
            visible()
        } else if (button.text.toString() == "sol" && text == "سل") {
            binding.textview.text = mylist.random()
            val player = create1(this,R.raw.correctanswer)
            player.start()
            visible()
        } else if (button.text.toString() == "la" && text == "لا") {
            binding.textview.text = mylist.random()
            val player = create1(this,R.raw.correctanswer)
            player.start()
            visible()
        } else if (button.text.toString() == "si" && text == "سی") {
            binding.textview.text = mylist.random()
            val player = create1(this,R.raw.correctanswer)
            player.start()
            visible()
        } else {
            button.visibility = View.INVISIBLE
            val player = create1(this,R.raw.wronganswer)
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