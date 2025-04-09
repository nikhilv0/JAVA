package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Model;
import com.xworkz.inheritance.additonal.Prabhas;

public class Rebel extends Model {
    public void rebelRole(Prabhas prabhas) {
        prabhas.walk();
        prabhas.pose();
        prabhas.dance();
        prabhas.display();
        prabhas.design();

        if (prabhas instanceof Model) {
            prabhas.prabhas();
            System.out.println("Casting RebelStar...");
        }
    }

}
