package com.example.dagger

import javax.inject.Inject

class Male @Inject constructor(){
private val name = "Ali"
    fun askName(): String {
        return name
    }
}