package dev.alimansour.springboot.demo.mycoolapp.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FunRestController {
    // expose "/" that return "Hello World

    @GetMapping("/")
    fun sayHello(): String {
        return "Hello World!"
    }

    @GetMapping("/workout")
    fun getDailyWorkout(): String {
        return "Run a hard 5k!"
    }

    @GetMapping("/fortune")
    fun getDailyFortune(): String {
        return "Today is your lucky day."
    }

}