package dev.alimansour.cruddemo.dao

import dev.alimansour.cruddemo.entity.Student
import jakarta.persistence.EntityManager
import jakarta.transaction.Transactional
import org.springframework.stereotype.Repository

@Repository
class StudentDaoImpl(
    private val entityManager: EntityManager
) : StudentDao {
    @Transactional
    override fun save(student: Student) {
        entityManager.persist(student)
    }
}
