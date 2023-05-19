package com.mapping.mapping.practice.service;

import com.mapping.mapping.practice.model.Address;
import com.mapping.mapping.practice.model.Student;
import com.mapping.mapping.practice.repository.IStudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepository studentRepository;

    public Iterable<Student> getAll() {
        return studentRepository.findAll();
    }

    public void addstudent(Student student) {
        Address address=student.getAddress();
        address.setStudent(student);
        studentRepository.save(student);
    }


    public Optional<Student> getbyid(Long id) {
        return studentRepository.findById(id);
    }

    public void deletebyid(Long id) {
        studentRepository.deleteById(id);
    }

    @Transactional
    public void updatebyid(Long id, String name) {
        studentRepository.updatefirstnamebyid(id,name);
    }
}
