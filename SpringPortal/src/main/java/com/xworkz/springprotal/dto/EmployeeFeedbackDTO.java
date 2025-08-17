package com.xworkz.springprotal.dto;

import com.xworkz.springprotal.enm.FeedbackType;
import lombok.Data;
import javax.validation.constraints.*;

@Data
public class EmployeeFeedbackDTO {

    @NotBlank(message = "Employee ID is required")
    private String employeeId;

    @NotBlank(message = "Department is required")
    private String department;

    @NotNull(message = "Feedback type is required")
    private FeedbackType feedbackType;

    @Min(value = 1, message = "Rating must be at least 1")
    @Max(value = 5, message = "Rating must not exceed 5")
    private int rating;

    @NotBlank(message = "Comments are required")
    private String comments;

    @NotBlank(message = "Employee name is required")
    private String employeeName;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;
}
