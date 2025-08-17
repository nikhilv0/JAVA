package com.xworkz.springprotal.dto;

import com.xworkz.springprotal.enm.Track;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.*;

public class ConferencePaperSubmissionDTO {

    @NotBlank(message = "Author name is required")
    @Size(min = 3, max = 100, message = "Author name must be between 3 and 100 characters")
    private String authorName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
    private long phone;

    @NotBlank(message = "Paper title is required")
    @Size(min = 5, max = 200, message = "Paper title must be between 5 and 200 characters")
    private String paperTitle;

    @NotBlank(message = "Abstract is required")
    @Size(min = 50, max = 2000, message = "Abstract must be between 50 and 2000 characters")
    private String abstractText;

    @NotBlank(message = "Keywords are required")
    @Size(min = 3, max = 200, message = "Keywords must be between 3 and 200 characters")
    private String keywords;

    @Enumerated(EnumType.STRING)
    @NotBlank(message = "Track is required")
    private Track track;

}
