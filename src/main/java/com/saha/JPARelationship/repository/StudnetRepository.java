package com.saha.JPARelationship.repository;
import com.saha.JPARelationship.model.Department;
import com.saha.JPARelationship.model.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;


@Repository
public class StudnetRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Student student) {
        entityManager.persist(student);
    }
}
