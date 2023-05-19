package com.mapping.mapping.practice.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "bookId")
public class Book {
    private Long bookId;
    private String author;
    private String description;
    private Integer price;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "student")
    private Student student;
}
