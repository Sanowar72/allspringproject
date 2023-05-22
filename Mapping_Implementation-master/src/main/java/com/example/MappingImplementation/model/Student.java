package com.example.MappingImplementation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;


    /*
    JsonUnwrapped annotation on the address property in the User class.
    This annotation tells Spring Boot to "unwrap" the address property
    and directly map its fields to the User entity.
    */
    @Embedded
    @JsonUnwrapped
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;

    //we ignore course because we don't want to assign course while registering the student
    @JsonIgnore
    @ManyToMany(mappedBy = "studentList")
    private List<Course> courses;
}
