package com.xworkz.projectusingspringandjpa.entity;

import com.xworkz.projectusingspringandjpa.enm.Gender;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "SignUp_table")

@NamedQueries({
        @NamedQuery(name = "SignUpEntity.existsByEmail", query = "SELECT COUNT(entity) FROM SignUpEntity entity WHERE entity.email = :email"),
        @NamedQuery(name = "SignUpEntity.findByEmail", query = "SELECT entity FROM SignUpEntity entity WHERE entity.email = :email"),
        @NamedQuery(name = "findEntityByToken",query = "SELECT entity FROM SignUpEntity entity WHERE entity.resetToken = :resetToken")
})
public class SignUpEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_fullname", nullable = false, length = 45)
    private String fullName;

    @Column(name = "user_email", nullable = false, unique = true, length = 45)
    private String email;

    @Column(name = "user_phone", nullable = false, unique = true, length = 10)
    private Long phone;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_gender", nullable = false, length = 10)
    private Gender gender;

    @Column(name = "user_age", nullable = false)
    private Integer age;

    @Column(name = "user_address", nullable = false, length = 100)
    private String address;

    @Column(name = "user_password", nullable = false, length = 70)
    private String password;

    @CreationTimestamp
    @Column(name = "user_createdDate" ,nullable = false)
    private Timestamp createdAt;

    @UpdateTimestamp
    @Column(name = "user_updatedAt")
    private Timestamp updatedAt;

    @Column(name = "reset_token")
    private String resetToken;

    @Column(name = "token_expiry")
    private LocalDateTime tokenExpiry;

}
