package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Model;
import com.xworkz.inheritance.additonal.Nithiin;

public class LoverBoy extends Model {
    public void romance(Nithiin nithiin) {
        nithiin.walk();
        nithiin.pose();
        nithiin.dance();
        nithiin.display();
        nithiin.design();

        if (nithiin instanceof Model) {
            nithiin.nithiin();
            System.out.println("Casting LoverBoy...");
        }
    }
}
