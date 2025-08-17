package com.xworkz.springprotal.entity;

import com.xworkz.springprotal.enm.AccountType;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "bank_account_opening")
public class BankAccountOpeningEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "holder_name", nullable = false, length = 50)
        private String holderName;

        @Column(name = "dob", nullable = false)
        private LocalDate dob;

        @Column(name = "email", nullable = false, unique = true)
        private String email;

        @Column(name = "phone", nullable = false, unique = true, length = 10)
        private long phone;

        @Enumerated(EnumType.STRING)
        @Column(name = "account_type", nullable = false, length = 20)
        private AccountType accountType;

        @Column(name = "aadhaar", nullable = false, unique = true, length = 12)
        private String aadhaar;

        @Column(name = "pan", nullable = false, unique = true, length = 10)
        private String pan;

        @Column(name = "opened_at")
        private Timestamp openedAt;

}
