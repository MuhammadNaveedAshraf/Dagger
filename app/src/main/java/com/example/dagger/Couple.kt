package com.example.dagger

import javax.inject.Inject

class Couple @Inject constructor(
    private val male: Male,
    private val female: Female
) {
    fun askNames(){
        println(male.askName()+", "+female.askName())
    }

}