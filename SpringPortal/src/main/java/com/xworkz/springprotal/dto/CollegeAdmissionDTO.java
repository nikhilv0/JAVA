package com.xworkz.springprotal.dto;

import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
public class CollegeAdmissionDTO {

    @NotBlank(message = "Student name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String studentName;

    @Past(message = "Date of Birth must be in the past")
    private LocalDate dob;

    @NotBlank(message = "Course is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String course;

    @NotBlank(message = "Qualification is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String qualification;

    @NotBlank(message = "Parent name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String parentName;

    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid parent contact number")
    private long parentContact;

    @Email(message = "Invalid email format")
    private String email;
}