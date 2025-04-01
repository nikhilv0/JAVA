package com.xworkz.enumObjects;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Example {
    public static void main(String[] args) {
        System.out.println(Match.TICKETS.getName());
        System.out.println(Match.PLACE.getName());

//        InbuiltClass inbuiltClass=new InbuiltClass();
//        inbuiltClass.setLocalDate("ygytu7");

        System.out.println(LocalDate.of(2025,5,21));
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.of(2026,5,31,12,20,12));

    }
}
