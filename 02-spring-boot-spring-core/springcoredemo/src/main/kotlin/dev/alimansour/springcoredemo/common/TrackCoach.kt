package dev.alimansour.springcoredemo.common

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
@Primary
class TrackCoach : Coach {
    init {
        println("In constructor: ${javaClass.simpleName}")
    }

    override fun getDailyWorkout(): String {
        return "Run a hard 5k!"
    }
}