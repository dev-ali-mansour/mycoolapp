package dev.alimansour.springdemo.mvc.validation

import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext

class CourseCodeConstraintValidator : ConstraintValidator<CourseCode, String> {

    private lateinit var coursePrefix: String

    override fun initialize(courseCode: CourseCode) {
        coursePrefix = courseCode.value
    }

    override fun isValid(
        value: String?,
        context: ConstraintValidatorContext?
    ): Boolean {
        return value?.startsWith(coursePrefix) ?: true
    }
}
