package com.xworkz.webappinspring.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class MilkDTO implements Serializable {

    private String type;
    private double quantity;
    private String expiryDate;
    private String brand;
    private double price;
}
