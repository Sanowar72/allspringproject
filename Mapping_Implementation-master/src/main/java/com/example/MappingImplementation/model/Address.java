package com.example.MappingImplementation.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class Address implements Serializable {

    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;

}
