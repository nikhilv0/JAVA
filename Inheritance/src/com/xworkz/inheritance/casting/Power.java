package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Model;
import com.xworkz.inheritance.additonal.PawanKalyan;

public class Power extends Model {
    public void powerMove(PawanKalyan pawan) {
        pawan.walk();
        pawan.pose();
        pawan.dance();
        pawan.display();
        pawan.design();

        if (pawan instanceof Model) {
            pawan.pawan();
            System.out.println("Casting PowerStar...");
        }
    }
}
