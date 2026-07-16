package dev.alimansour.springcoredemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/*
@SpringBootApplication(
    scanBasePackages = ["dev.alimansour.springcoredemo", "dev.alimansour.util"]
)
*/
@SpringBootApplication
class SpringcoredemoApplication

fun main(args: Array<String>) {
    runApplication<SpringcoredemoApplication>(*args)
}
