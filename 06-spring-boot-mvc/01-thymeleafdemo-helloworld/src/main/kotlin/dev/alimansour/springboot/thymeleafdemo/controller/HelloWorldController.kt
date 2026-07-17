package dev.alimansour.springboot.thymeleafdemo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloWorldController {
    @GetMapping("/showForm")
    fun showForm(): String {
        return "helloworld-form"
    }

    @GetMapping("/processForm")
    fun processForm(): String {
        return "helloworld"
    }
}
