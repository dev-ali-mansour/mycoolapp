package dev.alimansour.springboot.thymeleafdemo.controller

import dev.alimansour.springboot.thymeleafdemo.model.Student
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class StudentController {

    @GetMapping("/showStudentForm")
    fun showForm(model: Model): String {
        val student = Student()

        model.addAttribute("student", student)

        return "student-form"
    }

    @PostMapping("/processStudentForm")
    fun processForm(@ModelAttribute("student") student: Student): String {

        System.out.printf("Student: ${student.firstName} ${student.lastName}")
        
        return "student-confirmation"
    }
}
