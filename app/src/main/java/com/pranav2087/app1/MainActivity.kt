package com.pranav2087.app1

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.pranav2087.app1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binder: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binder.root)
        binder.button.setOnClickListener {
            binder.textView.text="Helloed World"
//            val newImageDrawable: Drawable? = ContextCompat.getDrawable(this, R.drawable.image2)
//            binder.imageView.setImageDrawable(newImageDrawable)
            setImageUsingGlide()
        }
    }
    private fun setImageUsingGlide() {
        Glide
            .with(this)
            .load("https://image.tmdb.org/t/p/original/iuFNMS8U5cb6xfzi51Dbkovj7vM.jpg")
            .centerCrop()
            .into(binder.imageView)
    }
}