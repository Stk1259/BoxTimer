package com.example.boxtimer

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    enum class TimerState{
        Stopped, Paused, Running
    }
    private lateinit var timer: CountDownTimer
    private var timerLengthSeconds = 0L
    private var secondsRemaining = 0L
    private var timerState = TimerState.Stopped
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_screen)
        val startPauseButton = findViewById<ImageView>(R.id.imageView_start)
        startButton.setOnClickListener{
            startTimer()
            timerState = TimerState.Running
            updateButtons()

        }
        if
    }
}