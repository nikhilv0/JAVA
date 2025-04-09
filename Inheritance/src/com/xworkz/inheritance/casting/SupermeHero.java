package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Model;
import com.xworkz.inheritance.additonal.SaiDharamTej;

public class SupermeHero extends Model {
    public void showSupremacy(SaiDharamTej sai) {
        sai.walk();
        sai.pose();
        sai.dance();
        sai.display();
        sai.design();

        if (sai instanceof Model) {
            sai.sai();
            System.out.println("Casting SupremeHero...");
        }
    }
}
