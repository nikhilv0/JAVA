package com.xworkz.RefAndvar;

public class City {
    String name;
    int population;
    double area;
    String state;

    City(String name, int population, double area, String state) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.state = state;
    }

    void cityMethod() {
        System.out.println("City:");
        System.out.println("City: " + name);
        System.out.println("Population: " + population);
        System.out.println("Area: " + area + " km²");
        System.out.println("State: " + state);

        Ward ward1=new Ward("Jayanagar",168,"BBMP","South Zone");
        Ward ward2=new Ward("Rajajinagar",80,"BBMP","South Zone");
        Ward ward3=new Ward("Kormangla",150,"BBMP","South Zone");
        Ward ward4=new Ward("BTM",130,"BBMP","South Zone");
        Ward[] wards={ward1,ward2,ward3,ward4};
        for (Ward ward:wards){
            ward.wardMethod();
        }

    }
}

