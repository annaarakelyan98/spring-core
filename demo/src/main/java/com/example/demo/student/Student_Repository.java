package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Student_Repository
        extends JpaRepository<Student_Model, Long> {

    Optional<Student_Model> findStudent_ModelByEmail(String email);
}
