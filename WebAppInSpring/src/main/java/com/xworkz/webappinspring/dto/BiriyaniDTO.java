package com.xworkz.webappinspring.dto;
import lombok.Data;

import java.io.Serializable;

@Data
public class BiriyaniDTO implements Serializable {

    private String name;
    private String type;
    private String spiceLevel;
    private int quantity;
    private double price;
}
