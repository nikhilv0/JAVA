package com.xworkz.webappinspring.dto;
import lombok.Data;

import java.io.Serializable;

@Data
public class ButterDTO implements Serializable {

    private String name;
    private String brand;
    private double weight;
    private String expiryDate;
    private double price;
}
