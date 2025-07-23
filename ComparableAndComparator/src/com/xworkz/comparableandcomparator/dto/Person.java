package com.xworkz.comparableandcomparator.dto;

import lombok.*;

import java.util.Comparator;

@EqualsAndHashCode
@NoArgsConstructor
@ToString
@Setter
@Getter
@AllArgsConstructor

public class Person implements Comparator {
    private String name;
    private String age;

    @Override
    public int compare(Object o1, Object o2) {
        if (){

        }
        return 1;
    }
}

