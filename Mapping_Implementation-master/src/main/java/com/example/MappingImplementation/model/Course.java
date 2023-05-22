package com.example.MappingImplementation.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, scope = Course.class,property = "courseId")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String title;
    private String description;
    private String duration;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "course")
    private List<Book> books;

    /*join table create separate table as its many to many relationship,
    join columns should take the table name entity which is primary key of the table which is going to join
    and the inverse join column for the column which you want to join from
    */
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "student_offered_course",
            joinColumns = @JoinColumn(name="course_id"),
            inverseJoinColumns = @JoinColumn(name="student_id"))
    private List<Student> studentList;

}
