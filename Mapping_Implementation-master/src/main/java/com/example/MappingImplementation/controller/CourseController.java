package com.example.MappingImplementation.controller;

import com.example.MappingImplementation.model.Course;
import com.example.MappingImplementation.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;


    @GetMapping
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }
    @PostMapping
    public Course saveCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @PutMapping("/{courseId}/student/{studentId}")
    public Course assignCourseToStudent(@PathVariable Long courseId, @PathVariable Long studentId){
        return courseService.assignCourseToStudent(courseId,studentId);
    }

    @DeleteMapping({"courseId"})
    public ResponseEntity<String> deleteCourse(@PathVariable Long courseId){
        return courseService.deleteCourse(courseId);
    }
}
