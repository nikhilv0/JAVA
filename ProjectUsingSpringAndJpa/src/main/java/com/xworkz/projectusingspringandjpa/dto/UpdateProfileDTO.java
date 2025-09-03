package com.xworkz.projectusingspringandjpa.dto;

import com.xworkz.projectusingspringandjpa.enm.Gender;
import lombok.Data;

import javax.validation.constraints.*;
import java.io.Serializable;

@Data
public class UpdateProfileDTO implements Serializable {

    @Size(min = 3, message = "Name must be at least 3 characters long")
    private String fullName;

    @Pattern(
            regexp = "^(?=.*[0-9])[a-zA-Z0-9._%+-]+@gmail\\.com$",
            message = "Email must be a valid Gmail address and contain at least one number"
    )
    private String email;

    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits")
    private Long phone;

    private Gender gender;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 70, message = "Age must be less than or equal to 70")
    private Integer age;

    private String address;


}
