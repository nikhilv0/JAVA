package com.xworkz.projectusingspringandjpa.entity;

import com.xworkz.projectusingspringandjpa.enm.Gender;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "SignUp_table")
@NamedQueries({
        @NamedQuery(name = "SignUpEntity.existsByEmail", query = "SELECT COUNT(entity) FROM SignUpEntity entity WHERE entity.email = :email"),
        @NamedQuery(name = "SignUpEntity.findByEmail", query = "SELECT entity FROM SignUpEntity entity WHERE entity.email = :email")
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
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_gender", nullable = false, length = 10)
    private Gender gender;

    @Column(name = "user_age", nullable = false)
    private Integer age;

    @Column(name = "user_address", nullable = false, length = 100)
    private String address;

    @Column(name = "user_password", nullable = false, length = 70)
    private String password;

    @Column(name = "user_createdDate" ,nullable = false)
    private Timestamp createdAt;
}
