package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Model;
import com.xworkz.inheritance.additonal.Nani;

public class NaturalStar extends Model {
    public void actNaturally(Nani nani) {
    nani.walk();
    nani.pose();
    nani.dance();
    nani.display();
    nani.design();

    if (nani instanceof Model) {
        nani.nani();
        System.out.println("Casting NaturalStar...");
    }
}

}
