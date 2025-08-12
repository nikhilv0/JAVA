package com.xworkz.webappinspring.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class ShoeDTO implements Serializable {

    private String brand;
    private String size;
    private String color;
    private String material;
    private double price;
}