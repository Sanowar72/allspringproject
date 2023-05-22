package com.example.MappingImplementation.service;

import com.example.MappingImplementation.model.Student;
import com.example.MappingImplementation.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepository iStudentRepository;

    public Student saveStudent(Student student) {
        return iStudentRepository.save(student);
    }

    public List<Student> getAllStudent() {
        return iStudentRepository.findAll();
    }

    public ResponseEntity<String> deleteStudent(Long studentId) {
        Student student = iStudentRepository.findByStudentId(studentId);
        if (student != null) {
            iStudentRepository.delete(student);
            return new ResponseEntity<String>("deleted successfully", HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<String>("No student with this id to delete", HttpStatus.NOT_FOUND);
        }
    }
}
