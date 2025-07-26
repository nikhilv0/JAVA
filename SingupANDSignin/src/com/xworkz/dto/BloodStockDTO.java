package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@AllArgsConstructor
public class BloodStockDTO implements Serializable {
    private String bloodGroup;
    private int quantity;
    private int id;
    private Timestamp createdat;
    private Timestamp updatedat;


    public BloodStockDTO(String bloodGroup, int quantity) {
        this.bloodGroup = bloodGroup;
        this.quantity = quantity;
    }

}
