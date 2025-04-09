package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Model;
import com.xworkz.inheritance.additonal.Sanjana;

public class GlamQueen extends Model {
    public void dazzleScreen(Sanjana sanjana) {
        sanjana.walk();
        sanjana.pose();
        sanjana.dance();
        sanjana.display();
        sanjana.design();

        if (sanjana instanceof Model) {
            sanjana.sanj();
            System.out.println("Casting GlamQueen...");
        }
    }

}
