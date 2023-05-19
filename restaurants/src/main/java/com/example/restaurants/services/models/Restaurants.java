package com.example.restaurants.services.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurants {
    @NotEmpty
    @NotBlank
    private String id;
    @NotBlank
    private String name;
    @NotBlank
    private String specialization;
}
