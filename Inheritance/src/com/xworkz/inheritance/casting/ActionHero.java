package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.KarthikeyaGummakonda;
import com.xworkz.inheritance.additonal.Model;

public class ActionHero extends Model {
    public void doStunts(KarthikeyaGummakonda karthikeya) {
        karthikeya.walk();
        karthikeya.pose();
        karthikeya.dance();
        karthikeya.display();
        karthikeya.design();

        if (karthikeya instanceof Model) {
            karthikeya.karthikeya();
            System.out.println("Casting ActionHero...");
        }
    }
}
