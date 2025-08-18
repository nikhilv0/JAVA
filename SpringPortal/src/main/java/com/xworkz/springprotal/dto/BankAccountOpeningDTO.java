package com.xworkz.springprotal.dto;

import com.xworkz.springprotal.enm.AccountType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
public class BankAccountOpeningDTO {

    @NotBlank(message = "Account holder name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String holderName;

    @NotNull(message = "Date of birth is required")
    @Past(message = "Date of birth must be in the past")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotNull(message = "Phone number is required")
    @Min(value = 6000000000L, message = "Invalid phone number")
    @Max(value = 9999999999L, message = "Invalid phone number")
    private Long phone;

    @NotNull(message = "Account type is required")
    private AccountType accountType;

    @NotBlank(message = "Aadhaar number is required")
    @Pattern(regexp = "^[2-9]{1}[0-9]{11}$", message = "Invalid Aadhaar number (12 digits)")
    private String aadhaar;

    @NotBlank(message = "PAN number is required")
    @Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$", message = "Invalid PAN number format")
    private String pan;
}
