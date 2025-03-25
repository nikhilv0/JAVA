package com.xworkz.RefAndvar;

public class Detail {
    String name;
    int age;
    String city;
    long number;

    Detail(String name,int age,String city,long number){
        this.name = name;
        this.age = age;
        this.city = city;
        this.number=number;
    }
    void detailMethod(){
        System.out.println("Detail:");
        System.out.println("name:"+this.name);
        System.out.println("age:"+this.age);
        System.out.println("city:"+this.city);
        System.out.println("number:"+this.number);
    }
}
