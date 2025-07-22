package com.xworkz.comparableandcomparator.dto;

import lombok.*;

@EqualsAndHashCode
@NoArgsConstructor
@ToString
@Setter
@Getter
@AllArgsConstructor

public class Person implements Comparable{
    private String name;
    private String age;


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

