package com.xworkz.RefAndvar;

public class State {
    String name;
    double population;
    String Leader;
    String Language;

    State(String name,double population,String Leader,String Language){
        this.name=name;
        this.population=population;
        this.Leader=Leader;
        this.Language=Language;

    }
    void stateMethod(){
        System.out.println("State:");
        System.out.println("Name:"+this.name);
        System.out.println("population:"+this.population+"M");
        System.out.println("Leader:"+this.Leader);
        System.out.println("Language:"+this.Language);

        District district1=new District("Bengaluru","INDIA",5,"Karnataka");
        District district2=new District(" Mysuru","INDIA",7,"Karnataka");
        District district3=new District("Pune","INDIA",14,"Maharastra");
        District district4=new District("BHyderabad","INDIA",16,"Telangana");
        District[] districts={district1,district2,district3,district4};
        for (District district:districts){
            district.Districtmethod();

        }

        City city1=new City("Bengaluru",12000000,709.5d,"Karnataka");
        City city2=new City("Mumbai",20400000,603.4d,"Maharashtra");
        City city3=new City("Chennai",11000000,426.0,"Tamil Nadu");
        City city4=new City("Hyderabad",10300000,650.0,"Telangana");
        City[] cities={city1,city2,city3,city4};
        for (City city:cities){
            city.cityMethod();
        }

    }
}
