package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Model;
import com.xworkz.inheritance.additonal.Venkatesh;

public class VictoryVenkatesh extends Model {
    public void celebrateVictory(Venkatesh venky) {
        venky.walk();
        venky.pose();
        venky.dance();
        venky.display();
        venky.design();

        if (venky instanceof Model) {
            venky.venkatesh();
            System.out.println("Casting VictoryVenkatesh...");
        }
    }
}
