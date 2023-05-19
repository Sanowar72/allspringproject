package com.mapping.mapping.practice.controller;

import com.mapping.mapping.practice.model.Course;
import com.mapping.mapping.practice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping
    public Iterable<Course> getall(){
        return courseService.getall();
    }
    @PostMapping(value = "addcourse")
    public String addbook(@RequestBody Course course){
        courseService.addbook(course);
        return "Added......";
    }

    @DeleteMapping(value = "/deletebyid/{id}")
    public String deletebyid(@PathVariable Long id){
        courseService.deletebyid(id);
        return "deleted........";
    }
}
