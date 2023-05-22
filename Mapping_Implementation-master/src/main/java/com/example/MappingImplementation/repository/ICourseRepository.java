package com.example.MappingImplementation.repository;

import com.example.MappingImplementation.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<Course,Long> {
    Course findByCourseId(Long courseId);
}
