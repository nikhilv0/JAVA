package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Model;
import com.xworkz.inheritance.additonal.SundeepKishan;

public class CoolPerformer extends Model {
    public void performCoolly(SundeepKishan sundeep) {
        sundeep.walk();
        sundeep.pose();
        sundeep.dance();
        sundeep.display();
        sundeep.design();

        if (sundeep instanceof Model) {
            sundeep.sundeep();
            System.out.println("Casting CoolPerformer...");
        }
    }
}
