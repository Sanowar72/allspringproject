package com.example.MappingImplementation.repository;

import com.example.MappingImplementation.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student,Long> {
    Student findByStudentId(Long studentId);
}
