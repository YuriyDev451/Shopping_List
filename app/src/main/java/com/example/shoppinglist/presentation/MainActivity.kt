package com.example.shoppinglist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.shoppinglist.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[ActivityViewModel::class.java]
        viewModel.shopList.observe(this) {
            Log.d("MainActivityTest", it.toString())
        }

    }
}