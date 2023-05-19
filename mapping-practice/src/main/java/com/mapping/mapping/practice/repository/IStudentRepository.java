package com.mapping.mapping.practice.repository;

import com.mapping.mapping.practice.model.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends CrudRepository<Student,Long> {

    @Modifying
    @Query(value = "update student set name = :name where student_id = :id" , nativeQuery = true)
    void updatefirstnamebyid(Long id,String name);
}
