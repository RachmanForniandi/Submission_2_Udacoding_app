package com.example.submission_2_udacoding_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonToCalculator.setOnClickListener {
            startActivity<CalculatorActivity>()
        }

        buttonToList.setOnClickListener {
            startActivity<ListRecyclerViewActivity>()
        }


    }
}
