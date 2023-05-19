package com.mapping.mapping.practice.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "studentId")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
//    @NotBlank
    private String name;
//    @NotBlank
    private Integer age;
//    @NotBlank
    private String phoneNumber;
    private String branch;
//    @Enumerated(EnumType.STRING)
    private String department;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Address address;
}
