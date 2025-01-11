package com.pranav2087.app1

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.pranav2087.app1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binder: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binder.root)
        binder.button.setOnClickListener {
            binder.textView.text="Helloed World"
            val newImageDrawable: Drawable? = ContextCompat.getDrawable(this, R.drawable.image2)
            binder.imageView.setImageDrawable(newImageDrawable)
        }
    }
}