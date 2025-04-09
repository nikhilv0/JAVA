package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Model;
import com.xworkz.inheritance.additonal.Nagarjuna;

public class King extends Model {
    public void ruleScene(Nagarjuna nagarjuna) {
    nagarjuna.walk();
    nagarjuna.pose();
    nagarjuna.dance();
    nagarjuna.display();
    nagarjuna.design();

    if (nagarjuna instanceof Model) {
        nagarjuna.nagarjuna();
        System.out.println("Casting King...");
    }
}
}
