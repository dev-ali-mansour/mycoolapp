package dev.alimansour.springboot.cruddemo.dao

import dev.alimansour.springboot.cruddemo.entity.Employee
import jakarta.persistence.EntityManager
import org.springframework.stereotype.Repository

@Repository
class EmployeeDAOImpl(
    private val entityManager: EntityManager
) : EmployeeDAO {
    override fun findAll(): List<Employee> {
        // create a query
        val query = entityManager.createQuery("From Employee ", Employee::class.java)

        // execute query and get result list
        val employees = query.resultList

        // return the results
        return employees
    }
}
