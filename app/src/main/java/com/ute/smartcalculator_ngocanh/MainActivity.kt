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
    private fun calculateResult(){
        val num1 = binding.edtNumber1.text.toString().toDoubleOrNull()
        val num2 = binding.edtNumber1.text.toString().toDoubleOrNull()
        if(num1==num2){
            Toast.makeText(this, getString(R.string.err_empty_input), Toast.LENGTH_SHORT).show()
            return
        }
        
    }
    }