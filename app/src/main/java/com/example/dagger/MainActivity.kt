package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.example.dagger.MyApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var couple: Couple

    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCoComponent.builder().build()
        couple = component.inject()
//        val male = component.maleInj()

//        val male = Male()
//        val female = Female()
//        val couple = Couple(male,female)

        couple.askNames()
    }
}