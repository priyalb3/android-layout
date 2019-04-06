package com.example.usinglayouts

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearButton: Button = findViewById(R.id.linear_button)
        val tableButton: Button = findViewById(R.id.table_button)
        val frameButton: Button = findViewById(R.id.frame_button)
        val gridButton: Button = findViewById(R.id.grid_view_button)
        val listButton: Button = findViewById(R.id.list_view_button)
        val relatvieButton: Button = findViewById(R.id.relative_button)

        linearButton.setOnClickListener {
            startActivity(
                Intent(this,LinearActivity::class.java)
            )
        }

        tableButton.setOnClickListener {
            startActivity(
                Intent(this,TableActivity::class.java)
            )
        }

        frameButton.setOnClickListener {
            startActivity(
                Intent(this,FrameActivity::class.java)
            )
        }

        gridButton.setOnClickListener {
            startActivity(
                Intent(this,GridActivity::class.java)
            )
        }

        listButton.setOnClickListener {
            startActivity(
                Intent(this,ListActivity::class.java)
            )
        }

        relatvieButton.setOnClickListener {
            startActivity(
                Intent(this,RelativeActivity::class.java)
            )
        }

    }
}
