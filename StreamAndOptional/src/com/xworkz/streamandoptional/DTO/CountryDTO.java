package com.xworkz.streamandoptional.DTO;

import lombok.*;

import java.io.Serializable;


@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CountryDTO implements Serializable {

    private String name ;
    private int ISOcode;
    private double populationInMillions;
    private int noOfStates;
    private double massInSqKms;
    private String primeMinister;
    private String primaryLang;
    private String secondaryLang;
    private double gdp;

    @Override
    public String toString() {
        return
                name  +
                " { ISOcode=" + ISOcode +
                ", populationInMillions=" + populationInMillions +
                ", noOfStates=" + noOfStates +
                ", massInSqKms=" + massInSqKms +
                ", primeMinister='" + primeMinister + '\'' +
                ", primaryLang='" + primaryLang + '\'' +
                ", secondaryLang='" + secondaryLang + '\'' +
                ", gdp=" + gdp +
                '}'+"\n";
    }
}
