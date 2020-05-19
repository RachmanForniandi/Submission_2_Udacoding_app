package com.example.submission_2_udacoding_app

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculator.*


class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        var hasil: Double

        btnTambah.setOnClickListener {
            val input1 = etInput1.text.toString()
            val input2 = etInput2.text.toString()
            if (input1.isEmpty() || input2.isEmpty()){
                Toast.makeText(this,"Semua input harus diisi!",Toast.LENGTH_SHORT).show()
            }else{

                val convertToDoubleInput1 = input1.toDouble()
                val convertToDoubleInput2 = input2.toDouble()
                hasil = convertToDoubleInput1 + convertToDoubleInput2
                tvResult.setText(hasil.toString())

            }
        }

        btnKurang.setOnClickListener {
            val input1 = etInput1.text.toString()
            val input2 = etInput2.text.toString()
            if (input1.isEmpty() || input2.isEmpty()){
                Toast.makeText(this,"Semua input harus diisi!",Toast.LENGTH_SHORT).show()

            }else{
                val convertToDoubleInput1 = input1.toDouble()
                val convertToDoubleInput2 = input2.toDouble()
                hasil = convertToDoubleInput1 - convertToDoubleInput2
                tvResult.setText(""+hasil.toString())
            }

        }

        btnKali.setOnClickListener {
            val input1 = etInput1.text.toString()
            val input2 = etInput2.text.toString()
            if (input1.isEmpty() || input2.isEmpty()){
                Toast.makeText(this,"Semua input harus diisi!",Toast.LENGTH_SHORT).show()

            }else{
                val convertToDoubleInput1 = input1.toDouble()
                val convertToDoubleInput2 = input2.toDouble()
                hasil = convertToDoubleInput1 *convertToDoubleInput2
                tvResult.setText(hasil.toString())

            }

        }


        btnBagi.setOnClickListener {
            val input1 = etInput1.text.toString()
            val input2 = etInput2.text.toString()

            if (input1.isEmpty() || input2.isEmpty()){
                Toast.makeText(this,"Semua input harus diisi!",Toast.LENGTH_SHORT).show()
            }else{
                val convertToDoubleInput1 = input1.toDouble()
                val convertToDoubleInput2 = input2.toDouble()
                hasil = convertToDoubleInput1 / convertToDoubleInput2
                tvResult.setText(hasil.toString())
            }

        }

        btnReset.setOnClickListener {
            tvResult.setText(""+ 0.0)
        }


    }

}
