package com.xworkz.associationandinit.dto;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode

public class Product {
    private int productId;
    private String productName;
    private double price;
    private String category;

}
