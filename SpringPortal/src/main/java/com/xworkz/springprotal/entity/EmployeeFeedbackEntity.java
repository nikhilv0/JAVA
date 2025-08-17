package com.xworkz.springprotal.entity;

import com.xworkz.springprotal.enm.FeedbackType;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "employee_feedback")
@Data
public class EmployeeFeedbackEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,unique = true)
    private String employeeId;

    @Column(nullable = false)
    private String department;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FeedbackType feedbackType;

    @Column(nullable = false)
    private int rating;

    @Column(nullable = false, length = 1000)
    private String comments;

    @Column(nullable = false)
    private String employeeName;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "created_at")
    private Timestamp createdAt;
}
