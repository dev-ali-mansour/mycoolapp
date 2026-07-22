package dev.alimansour.cruddemo.dao

import dev.alimansour.cruddemo.entity.Instructor
import jakarta.persistence.EntityManager
import jakarta.transaction.Transactional
import org.springframework.stereotype.Repository

@Repository
class AppDAOImpl(private val entityManager: EntityManager) : AppDAO {

    @Transactional
    override fun save(instructor: Instructor) {
        entityManager.persist(instructor)
    }
}
