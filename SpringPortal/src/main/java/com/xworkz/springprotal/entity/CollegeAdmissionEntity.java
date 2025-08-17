package com.xworkz.springprotal.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "college_admission")
public class CollegeAdmissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_name", nullable = false, length = 100)
    private String studentName;

    @Column(name = "dob", nullable = false)
    private LocalDate dob;

    @Column(name = "course", nullable = false, length = 100)
    private String course;

    @Column(name = "qualification", nullable = false, length = 100)
    private String qualification;

    @Column(name = "parent_name", nullable = false, length = 100)
    private String parentName;

    @Column(name = "parent_contact", nullable = false, length = 15)
    private long parentContact;

    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "applied_at")
    private Timestamp appliedAt;
}