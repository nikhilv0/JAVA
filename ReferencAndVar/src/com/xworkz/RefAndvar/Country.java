package com.xworkz.RefAndvar;

public class Country {
    String name;
    String position;
    double Population;
    String party;

    Country(String name,String position,double Population,String party){
        this.name=name;
        this.position=position;
        this.Population=Population;
        this.party=party;

        }
        void Display(){
            System.out.println("Country:");
            System.out.println("Name:"+this.name);
            System.out.println("Position:"+this.position);
            System.out.println("Population:"+this.Population+"Billon");
            System.out.println("Part:"+this.party);

            PrimeMinister primeMinister=new PrimeMinister("Nikhil","INDIA","Congress","Congress");
                primeMinister.primeMethod();
    }
}
