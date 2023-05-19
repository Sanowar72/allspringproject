package com.mapping.mapping.practice.repository;

import com.mapping.mapping.practice.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository extends CrudRepository<Course,Long> {
}
