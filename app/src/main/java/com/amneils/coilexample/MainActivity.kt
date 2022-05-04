package com.amneils.coilexample

import android.os.Bundle
import android.transition.CircularPropagation
import androidx.appcompat.app.AppCompatActivity
import coil.api.load
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        myImageView.load(distantImageUrl) {
            placeholder(R.drawable.ic_launcher_background)
            transformations(CircleCropTransformation())
            transformations(CircleCropTransformation())
            transformations(CircleCropTransformation())
        }


    }

    companion object {
        var distantImageUrl = "https://i.ibb.co/RhXYm93/img-to-load.jpg"
    }
}
