package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x:String = "Text"
        var y:String = "Happy"
        var box:String = ""
        var txt_box:TextView = findViewById(R.id.txtBox)
        for (i in 1..5) {
            box = box + x
        }
        box = box +y
        txt_box.setText(box)
        Log.d("str=",x+y)

    }
}
