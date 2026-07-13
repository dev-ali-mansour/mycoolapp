package dev.alimansour.springcoredemo.common

import org.springframework.stereotype.Component

@Component
class TennisCoach: Coach {
    init {
        println("In constructor: ${javaClass.simpleName}")
    }

    override fun getDailyWorkout(): String {
        return "Practice your backhand volley"
    }
}
