package com.xworkz.webappinspring.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class BottleDTO implements Serializable {

    private String name;
    private int price;
    private String color;
    private double capacity;
    private String material;
}