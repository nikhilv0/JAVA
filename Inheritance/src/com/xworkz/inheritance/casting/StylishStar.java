package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.AlluArjun;
import com.xworkz.inheritance.additonal.Model;

public class StylishStar extends Model {
    public void danceStyle(AlluArjun alluarjun) {
        alluarjun.walk();
        alluarjun.pose();
        alluarjun.dance();
        alluarjun.display();
        alluarjun.design();

        if (alluarjun instanceof Model) {
            Model model = (Model) alluarjun;
            alluarjun.allu();
            System.out.println("Casting StylishStar...");
        }
    }
}

