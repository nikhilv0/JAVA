package com.xworkz.webappinspring.dto;


import lombok.Data;

import java.io.Serializable;
@Data
public class OnionDTO implements Serializable {

    private String type;
    private String origin;
    private double weight;
    private String quality;
    private double pricePerKg;

}