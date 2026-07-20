package dev.alimansour.springdemo.mvc.validation

import jakarta.validation.Constraint
import jakarta.validation.Payload
import kotlin.reflect.KClass

@Constraint(validatedBy = [CourseCodeConstraintValidator::class])
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class CourseCode(
    val value: String = "LUV",
    val message: String = "must start with LUV",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)

