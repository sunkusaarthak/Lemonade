package com.learn.lemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var temp = 0;
        var text: TextView = findViewById(R.id.textView)
        var img: ImageView = findViewById(R.id.imageView)
        img.setOnClickListener(View.OnClickListener {
            temp++;
            when(temp)
            {
                0 -> {
                    text.text = "Click to Select a lemon!"
                    img.setImageResource(R.drawable.lemon_tree)
                }
                1 -> {
                    text.text = "Click to Juice the lemon!"
                    img.setImageResource(R.drawable.lemon_squeeze)
                }
                2 -> {
                    text.text = "Click to Drink Your Lemonade!"
                    img.setImageResource(R.drawable.lemon_drink)
                }
                3 -> {
                    text.text = "Click to Start Again!"
                    img.setImageResource(R.drawable.lemon_restart)
                }
                else -> {
                    temp = 0;
                }
            }
        })

    }
}