package com.xworkz.webappinspring.dto;
import lombok.Data;

import java.io.Serializable;
@Data
public class ParotaDTO implements Serializable {

    private String type;
    private String ingredients;
    private int quantity;
    private String size;
    private double price;
}