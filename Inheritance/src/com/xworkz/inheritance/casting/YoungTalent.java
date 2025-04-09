package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Aryan;
import com.xworkz.inheritance.additonal.Model;

public class YoungTalent extends Model {
    public void debut(Aryan aryan) {
        aryan.walk();
        aryan.pose();
        aryan.dance();
        aryan.display();
        aryan.design();

        if (aryan instanceof Model) {
            aryan.aryan();
            System.out.println("Casting YoungTalent...");
        }
    }
}
