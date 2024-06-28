package com.example.university.repository;

import com.example.university.model.*;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CourseJpaRepository extends JpaRepository<Course, Integer> {
    List<Course> findByProfessor(Professor professor);
}