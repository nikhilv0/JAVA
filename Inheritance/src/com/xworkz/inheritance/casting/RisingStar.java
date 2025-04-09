package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.AkhilAkkineni;
import com.xworkz.inheritance.additonal.Model;

public class RisingStar extends Model {
    public void shine(AkhilAkkineni akhilAkkineni) {
        akhilAkkineni.walk();
        akhilAkkineni.pose();
        akhilAkkineni.dance();
        akhilAkkineni.display();
        akhilAkkineni.design();

        if (akhilAkkineni instanceof Model) {
            Model model = (Model) akhilAkkineni;
            akhilAkkineni.run();
            System.out.println("Casting RisingStar...");
        }
    }
}

