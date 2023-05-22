package com.example.MappingImplementation.service;

import com.example.MappingImplementation.model.Book;
import com.example.MappingImplementation.model.Course;
import com.example.MappingImplementation.model.Student;
import com.example.MappingImplementation.repository.ICourseRepository;
import com.example.MappingImplementation.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private ICourseRepository iCourseRepository;

    @Autowired
    private IStudentRepository iStudentRepository;

    public Course saveCourse(Course course) {
        List<Book> bookList = course.getBooks();
        for(Book book : bookList){
            book.setCourse(course);
        }
        return iCourseRepository.save(course);
    }



    public Course assignCourseToStudent(Long courseId, Long studentId){
       List<Student> studentList = null;
        Course course = iCourseRepository.findByCourseId(courseId);
        Student student = iStudentRepository.findByStudentId(studentId);
        studentList.add(student);
        course.setStudentList(studentList);
        return iCourseRepository.save(course);

    }

    public ResponseEntity<String> deleteCourse(Long courseId) {
        Course course = iCourseRepository.findByCourseId(courseId);
        if (course != null) {
            iCourseRepository.delete(course);
            return new ResponseEntity<String>("deleted successfully",HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<String>("No course with this id to delete", HttpStatus.NOT_FOUND);
        }
    }

    public List<Course> getAllCourse() {
        return iCourseRepository.findAll();
    }
}
