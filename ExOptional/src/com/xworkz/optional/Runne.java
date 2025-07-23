package com.xworkz.optional;

import java.util.Optional;

public class Runne {
    public static void main(String[] args) {

        OptionalExamp optionalExamp=new OptionalExamp();
        Optional<String> optional=optionalExamp.getNameByNum(12345);
        if (optional.isPresent()){
            System.out.println(optional.get());
        }


    }
}
