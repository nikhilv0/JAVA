package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Model;
import com.xworkz.inheritance.additonal.Shashank;

public class Versatile extends Model {
    public void adaptRole(Shashank shashank) {
        shashank.walk();
        shashank.pose();
        shashank.dance();
        shashank.display();
        shashank.design();

        if (shashank instanceof Model) {
            shashank.shashank();
            System.out.println("Casting VersatileActor...");
        }
    }
}
