package com.mapping.mapping.practice.controller;

import com.mapping.mapping.practice.model.Address;
import com.mapping.mapping.practice.model.Student;
import com.mapping.mapping.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/home")
    public String home(){
        return "this is home ........";
    }
    @GetMapping
    public Iterable<Student> getall(){
        return studentService.getAll();
    }
    @PostMapping(value = "addstudent")
    public String addData(@RequestBody Student student){
        studentService.addstudent(student);
        return "Student added Successfully........";
    }
    @GetMapping(value = "/byid/{id}")
    public Optional<Student> getbyid(@PathVariable Long id){
        return studentService.getbyid(id);
    }
    @PutMapping(value = "updatebyid/{id}/{name}")
    public void updatebyid(@PathVariable Long id,@PathVariable String name){
        studentService.updatebyid(id,name);
    }
    @DeleteMapping(value = "delete/{id}")
    public String deletebyid(@PathVariable Long id){
        studentService.deletebyid(id);
        return "Successfully deleted.......";
    }
}
