package com.xworkz.webappinspring.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class ChappalDTO implements Serializable {

    private String brand;
    private String size;
    private String color;
    private double price;
    private String material;
}