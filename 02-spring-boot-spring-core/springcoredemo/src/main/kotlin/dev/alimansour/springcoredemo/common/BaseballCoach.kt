package dev.alimansour.springcoredemo.common

import org.springframework.stereotype.Component

@Component
class BaseballCoach : Coach {
    init {
        println("In constructor: ${javaClass.simpleName}")
    }

    override fun getDailyWorkout(): String {
        return "Spend 30 minutes on batting practice"
    }
}
