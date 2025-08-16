package com.xworkz.projectusingspringandjpa.dto;

import com.xworkz.projectusingspringandjpa.enm.Gender;
import lombok.Data;

import javax.validation.constraints.*;
import java.io.Serializable;

@Data
public class SignUpDTO implements Serializable {

    @NotBlank(message = "Full name is required")
    @Size(min = 3, message = "Name must be at least 3 characters long")
    private String fullName;

    @NotBlank(message = "Email is required")
    @Pattern(
            regexp = "^(?=.*[0-9])[a-zA-Z0-9._%+-]+@gmail\\.com$",
            message = "Email must be a valid Gmail address and contain at least one number"
    )
    private String email;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits")
    private String phone;

    @NotNull(message = "Gender is required")
    private Gender gender;

    @NotNull(message = "Age is required")
    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 70, message = "Age must be less than or equal to 70")
    private Integer age;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Password is required")
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$",
            message = "Password must be at least 8 characters long, include uppercase, lowercase, number, and special character"
    )
    private String password;

    @NotBlank(message = "Confirm Password is required")
    private String confirmPassword;

}
