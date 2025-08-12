package com.xworkz.webappinspring.dto;


import lombok.Data;

import java.io.Serializable;
@Data
public class EggDTO implements Serializable {

    private String type;
    private String farmName;
    private int weight;
    private int quantity;
    private double pricePerDozen;
}