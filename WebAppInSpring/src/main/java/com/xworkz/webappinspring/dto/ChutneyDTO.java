package com.xworkz.webappinspring.dto;
import lombok.Data;

import java.io.Serializable;

@Data
public class ChutneyDTO implements Serializable {

    private String name;
    private int price;
}
