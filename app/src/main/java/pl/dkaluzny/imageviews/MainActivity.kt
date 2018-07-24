package pl.dkaluzny.imageviews

import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var catImage = catImageView
        var dogImage = dogImageView


        catImage.setColorFilter(Color.BLUE)
        dogImage.setColorFilter(Color.CYAN)

        catImage.setOnClickListener {
            catImage.clearColorFilter()
            catImage.setColorFilter(Color.GREEN, PorterDuff.Mode.DARKEN)
            catImage.setColorFilter(Color.MAGENTA)
        }

    }
}
