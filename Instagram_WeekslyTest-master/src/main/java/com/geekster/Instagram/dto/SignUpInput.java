package com.geekster.Instagram.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpInput {

    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @Length(min = 13)
    private Integer age;
    @Email
    private String email;
    private String userPassword;
    @Length(max = 12, min = 10)
    private String phoneNumber;
}
