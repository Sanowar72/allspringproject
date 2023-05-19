package com.mapping.mapping.practice.service;

import com.mapping.mapping.practice.model.Course;
import com.mapping.mapping.practice.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    ICourseRepository courseRepository;


    public Iterable<Course> getall() {
        return courseRepository.findAll();
    }

    public void addbook(Course course) {
        courseRepository.save(course);
    }

    public void deletebyid(Long id) {
        courseRepository.deleteById(id);
    }
}
