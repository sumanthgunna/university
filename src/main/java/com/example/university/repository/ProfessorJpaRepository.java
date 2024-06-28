package com.example.university.repository;

import com.example.university.model.*;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProfessorJpaRepository extends JpaRepository<Professor, Integer> {

}