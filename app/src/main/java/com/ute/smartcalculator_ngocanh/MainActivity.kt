package com.ute.smartcalculator_ngocanh

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ute.smartcalculator_ngocanh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutlnflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener{
            calculateResult()
        }
        binding.btnReset.SetOnClickListener{
            resetFields()
        }
        }
        private fun
    }