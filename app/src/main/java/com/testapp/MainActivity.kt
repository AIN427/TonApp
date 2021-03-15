package com.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ee.nx01.tonclient.TonClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val client = TonClient()
    }
}