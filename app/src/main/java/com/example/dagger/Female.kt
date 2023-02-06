package com.example.dagger

import javax.inject.Inject

class Female @Inject constructor(){
    private val name = "Fatima"
    fun askName(): String {
        return name
    }
}