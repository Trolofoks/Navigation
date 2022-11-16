package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //добавление стрелки(возврата) при переходе
        setupActionBarWithNavController(findNavController(R.id.fragmentContainerView))
    }
    //работоспособность стрелки
    override fun onSupportNavigateUp(): Boolean {
        val controller = findNavController(R.id.fragmentContainerView)
        return super.onSupportNavigateUp() || controller.navigateUp()
    }
}