package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Model;
import com.xworkz.inheritance.additonal.Sharwanand;

public class RomanticHero extends Model {
    public void expressLove(Sharwanand sharwa) {
        sharwa.walk();
        sharwa.pose();
        sharwa.dance();
        sharwa.display();
        sharwa.design();

        if (sharwa instanceof Model) {
            sharwa.sharwand();
            System.out.println("Casting RomanticHero...");
        }
    }
}
