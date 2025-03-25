package com.xworkz.GetterAndSetter;

public class Orbit {
    void orbitDisplay(Satellite satellite){
        if (satellite!=null){
            System.out.println("Type:"+satellite.getType());
            System.out.println("Weight:"+satellite.getWeight());
            System.out.println("Cost:"+satellite.getCost());
            System.out.println("LoadCapacity:"+satellite.getLoadCapacity());

        }
    }
}
