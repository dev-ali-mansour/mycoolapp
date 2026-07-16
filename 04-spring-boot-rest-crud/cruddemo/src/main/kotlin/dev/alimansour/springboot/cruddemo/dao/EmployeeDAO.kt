package dev.alimansour.springboot.cruddemo.dao

import dev.alimansour.springboot.cruddemo.entity.Employee

interface EmployeeDAO {
    fun findAll(): List<Employee>
}
