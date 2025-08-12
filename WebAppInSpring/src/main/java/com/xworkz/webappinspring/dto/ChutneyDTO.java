package com.xworkz.webappinspring.dto;
import lombok.Data;

import java.io.Serializable;

@Data
public class ChutneyDTO implements Serializable {

    private String name;
    private String type;
    private String spiceLevel;
    private double quantity;
    private double price;
}
