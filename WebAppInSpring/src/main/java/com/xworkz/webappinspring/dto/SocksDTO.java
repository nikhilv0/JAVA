package com.xworkz.webappinspring.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class SocksDTO implements Serializable {

    private String color;
    private String material;
    private String size;
    private String brand;
    private double price;
}
