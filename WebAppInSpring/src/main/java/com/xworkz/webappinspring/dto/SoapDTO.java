package com.xworkz.webappinspring.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class SoapDTO implements Serializable {

    private String name;
    private String brand;
    private double weight;
    private String fragrance;
    private double price;
}