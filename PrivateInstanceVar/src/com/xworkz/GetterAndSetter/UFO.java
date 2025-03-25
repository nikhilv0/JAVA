package com.xworkz.GetterAndSetter;

public class UFO {
    void UFODispaly(Alien alien){
        if (alien!=null){
            System.out.println("SeenBy:"+alien.getSeenBy());
            System.out.println("SeenDate;"+alien.getSeenDate());
            System.out.println("Describe:"+alien.getDescribe());

        }
    }
}
