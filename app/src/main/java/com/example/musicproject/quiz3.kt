package com.example.musicproject

import android.content.Context
import android.content.Intent
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import com.example.musicproject.databinding.ActivityQuiz2Binding
import com.example.musicproject.databinding.ActivityQuiz3Binding

class quiz3 : AppCompatActivity() {
    var jun = 2
    lateinit var binding: ActivityQuiz3Binding
    var yesorno = "false"
    lateinit var timer: CountDownTimer
    lateinit var timer2: CountDownTimer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz3Binding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        timer = object : CountDownTimer(60000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                binding.time.text = (millisUntilFinished / 1000).toString()
            }

            override fun onFinish() {
                if (yesorno == "false") {
                    vibrate()
                    binding.cnextlesson.visibility = View.VISIBLE
                    binding.constraintlayout.setBackgroundColor(ContextCompat.getColor(this@quiz3,
                        R.color.gray))
                    timer.cancel()
                    binding.tabrik.text = "باختی!"
                    binding.payam.text = "متاسفانه نتونستی این مرحله رو با موفقیت به پایان بدی"
                    binding.next.text = "برگشت به صفحه اصلی"
                }
            }
        }.start()
        binding.nextlesson.setOnClickListener {
            if (binding.next.text == "برگشت به صفحه اصلی") {
                val intent = Intent(this, lessons::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, lesson4::class.java)
                startActivity(intent)
            }
        }
    }

    fun onclick(view: View) {
        val button = view as Button
        val text = button.text
        val mylist = listOf<String>("1", "2", "3", "4", "5", "6", "7")
        if (text == "دو" && binding.textview.text == "1") {
            binding.textview.text = mylist.random()
            val slt = binding.number.text.toString().split("/")
            val next = slt[0].toInt() + 1
            if (next == 25) {
                yesorno = "true"
                binding.cnextlesson.visibility = View.VISIBLE
                binding.constraintlayout.setBackgroundColor(ContextCompat.getColor(this,
                    R.color.gray))
                timer.cancel()
            } else {
                binding.number.text = next.toString() + "/" + slt[1]
            }
        } else if (text == "ر" && binding.textview.text == "2") {
            binding.textview.text = mylist.random()
            val slt = binding.number.text.toString().split("/")
            val next = slt[0].toInt() + 1
            if (next == 25) {
                yesorno = "true"
                binding.cnextlesson.visibility = View.VISIBLE
                binding.constraintlayout.setBackgroundColor(ContextCompat.getColor(this,
                    R.color.gray))
                timer.cancel()
            } else {
                binding.number.text = next.toString() + "/" + slt[1]
            }
        } else if (text == "می" && binding.textview.text == "3") {
            binding.textview.text = mylist.random()
            val slt = binding.number.text.toString().split("/")
            val next = slt[0].toInt() + 1
            if (next == 25) {
                yesorno = "true"
                binding.cnextlesson.visibility = View.VISIBLE
                binding.constraintlayout.setBackgroundColor(ContextCompat.getColor(this,
                    R.color.gray))
                timer.cancel()
            } else {
                binding.number.text = next.toString() + "/" + slt[1]
            }
        } else if (text == "فا" && binding.textview.text == "4") {
            binding.textview.text = mylist.random()
            val slt = binding.number.text.toString().split("/")
            val next = slt[0].toInt() + 1
            if (next == 25) {
                yesorno = "true"
                binding.cnextlesson.visibility = View.VISIBLE
                binding.constraintlayout.setBackgroundColor(ContextCompat.getColor(this,
                    R.color.gray))
                timer.cancel()
            } else {
                binding.number.text = next.toString() + "/" + slt[1]
            }
        } else if (text == "سل" && binding.textview.text == "5") {
            binding.textview.text = mylist.random()
            val slt = binding.number.text.toString().split("/")
            val next = slt[0].toInt() + 1
            if (next == 25) {
                yesorno = "true"
                binding.cnextlesson.visibility = View.VISIBLE
                binding.constraintlayout.setBackgroundColor(ContextCompat.getColor(this,
                    R.color.gray))
                timer.cancel()
            } else {
                binding.number.text = next.toString() + "/" + slt[1]
            }
        } else if (text == "لا" && binding.textview.text == "6") {
            binding.textview.text = mylist.random()
            val slt = binding.number.text.toString().split("/")
            val next = slt[0].toInt() + 1
            if (next == 25) {
                yesorno = "true"
                binding.cnextlesson.visibility = View.VISIBLE
                binding.constraintlayout.setBackgroundColor(ContextCompat.getColor(this,
                    R.color.gray))
                timer.cancel()
            } else {
                binding.number.text = next.toString() + "/" + slt[1]
            }
        } else if (text == "سی" && binding.textview.text == "7") {
            binding.textview.text = mylist.random()
            val slt = binding.number.text.toString().split("/")
            val next = slt[0].toInt() + 1
            if (next == 25) {
                yesorno = "true"
                binding.cnextlesson.visibility = View.VISIBLE
                binding.constraintlayout.setBackgroundColor(ContextCompat.getColor(this,
                    R.color.gray))
                timer.cancel()
            } else {
                binding.number.text = next.toString() + "/" + slt[1]
            }
        } else {
            jun -= 1
            if (jun == 0) {
                yesorno = "t"
                vibrate()

                binding.tabrik.text = "باختی!"
                binding.payam.text = "متاسفانه نتونستی این مرحله رو با موفقیت به پایان بدی"
                binding.next.text = "برگشت به صفحه اصلی"
                binding.cnextlesson.visibility = View.VISIBLE
                timer.cancel()
                binding.constraintlayout.setBackgroundColor(ContextCompat.getColor(this,
                    R.color.gray))
            }
        }
    }

    fun Context.vibrate(milliseconds: Long = 700) {
        val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

        // Check whether device/hardware has a vibrator
        val canVibrate: Boolean = vibrator.hasVibrator()

        if (canVibrate) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                // void vibrate (VibrationEffect vibe)
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        milliseconds,
                        // The default vibration strength of the device.
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                // This method was deprecated in API level 26
                vibrator.vibrate(milliseconds)
            }
        }
    }
}