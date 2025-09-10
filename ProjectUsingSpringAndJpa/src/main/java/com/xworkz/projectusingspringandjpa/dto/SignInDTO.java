package com.xworkz.projectusingspringandjpa.dto;

import lombok.Data;
import javax.validation.constraints.*;
import java.io.Serializable;

@Data
public class SignInDTO implements Serializable {

    @NotBlank(message = "Email is required")
    @Pattern(
            regexp = "^(?=.*[0-9])[a-zA-Z0-9._%+-]+@gmail\\.com$",
            message = "Email must be a valid Gmail address and contain at least one number"
    )
    private String email;

//    @NotBlank(message = "Password is required")
//    @Pattern(
//            regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$",
//            message = "Password must be at least 8 characters long, include uppercase, lowercase, number, and special character"
//    )
//    private String password;
}
