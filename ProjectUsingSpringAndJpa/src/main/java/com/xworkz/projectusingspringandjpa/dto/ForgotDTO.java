package com.xworkz.projectusingspringandjpa.dto;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
public class ForgotDTO implements Serializable {

    @NotBlank(message = "Email is required")
    @Pattern(
            regexp = "^(?=.*[0-9])[a-zA-Z0-9._%+-]+@gmail\\.com$",
            message = "Email must be a valid Gmail address and contain at least one number"
    )
    private String email;
}
