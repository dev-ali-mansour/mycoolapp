package dev.alimansour.springcoredemo.common

class SwimCoach : Coach {
    init {
        println("In constructor: ${javaClass.simpleName}")
    }

    override fun getDailyWorkout(): String {
        return "Swim 1000 meters as a warm up"
    }
}
