package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Model;
import com.xworkz.inheritance.additonal.RaviTeja;

public class MassMaharaja extends Model {
    public void entertainMass(RaviTeja ravi) {
        ravi.walk();
        ravi.pose();
        ravi.dance();
        ravi.display();
        ravi.design();

        if (ravi instanceof Model) {
            ravi.ravi();
            System.out.println("Casting MassMaharaja...");
        }
    }
}
