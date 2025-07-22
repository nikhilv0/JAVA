package com.xworkz.associationandinit.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode

public class Company {
    private Product product;
    private int companyId;
    private String companyName;
    private String location;
    private String industryType;

    public Company(int companyId, String companyName, String location, String industryType,Product product) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.location = location;
        this.industryType = industryType;
        this.product=product;
    }
}
