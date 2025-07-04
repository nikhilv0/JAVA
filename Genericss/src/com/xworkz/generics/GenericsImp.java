package com.xworkz.generics;

public class GenericsImp {


    String work(Generics<String> generics){
        System.out.println(generics.run());
        return work(generics);
    }
}
