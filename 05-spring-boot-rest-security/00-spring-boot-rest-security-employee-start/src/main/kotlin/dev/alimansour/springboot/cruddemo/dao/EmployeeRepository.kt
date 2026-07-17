package dev.alimansour.springboot.cruddemo.dao

import dev.alimansour.springboot.cruddemo.entity.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

interface EmployeeRepository : JpaRepository<Employee, Long>
