package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Chiranjeevi;
import com.xworkz.inheritance.additonal.Model;

public class Megastar extends Model {
    public void leadMovie(Chiranjeevi chiranjeevi) {
        chiranjeevi.walk();
        chiranjeevi.pose();
        chiranjeevi.dance();
        chiranjeevi.display();
        chiranjeevi.design();

        if (chiranjeevi instanceof Model) {
            chiranjeevi.chiru();
            System.out.println("Casting Megastar...");
        }
    }
}
