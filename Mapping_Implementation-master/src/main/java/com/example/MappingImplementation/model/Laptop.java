package com.example.MappingImplementation.model;

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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, scope = Laptop.class,property = "laptopId")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long laptopId;
    private String name;
    private String brand;
    private Integer price;

    //bidirection relationship and mappedBy helps to make laptop independent table
    @OneToOne(mappedBy = "laptop")
    private Student student;

}
