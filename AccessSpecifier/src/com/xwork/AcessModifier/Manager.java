package com.xwork.AcessModifier;
import com.xworkz.AccessSpecifer.*;

public class Manager {
        void detail(){
            House house=new House();

            house.demonish();
            Owner owner=new Owner(house);
            owner.ownerdisplay();
            System.out.println("hi");
        }
}
