package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Model;
import com.xworkz.inheritance.additonal.RamCharan;

public class MegaSon extends Model {
    public void megaStrike(RamCharan ram) {
        ram.walk();
        ram.pose();
        ram.dance();
        ram.display();
        ram.design();

        if (ram instanceof Model) {
            ram.ram();
            System.out.println("Casting MegaPowerStar...");
        }
    }

}
