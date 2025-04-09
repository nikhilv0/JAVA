package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Model;
import com.xworkz.inheritance.additonal.VarunTej;

public class MegaPrince extends Model {
    public void risePowerfully(VarunTej varun) {
        varun.walk();
        varun.pose();
        varun.dance();
        varun.display();
        varun.design();

        if (varun instanceof Model) {
            varun.varun();
            System.out.println("Casting MegaPrince...");
        }
    }
}
