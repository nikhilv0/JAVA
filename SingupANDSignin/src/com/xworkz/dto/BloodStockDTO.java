package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@AllArgsConstructor
public class BloodStockDTO implements Serializable {
    private String bloodGroup;
    private int quantity;
}
