package com.example.dagger

import dagger.Component

@Component
interface CoComponent {

//    fun maleInj():Male
//    fun femaleInj():Female
    fun inject():Couple
}