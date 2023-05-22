package com.example.MappingImplementation.controller;

import com.example.MappingImplementation.model.Student;
import com.example.MappingImplementation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student saveStudent(@RequestBody Student Student){
        return studentService.saveStudent(Student);
    }

    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }


    @DeleteMapping("/{studentId}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long studentId){
        return studentService.deleteStudent(studentId);
    }
}
