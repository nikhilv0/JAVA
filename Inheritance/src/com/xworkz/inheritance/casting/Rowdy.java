package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Model;
import com.xworkz.inheritance.additonal.VijayDeverakonda;

public class Rowdy extends Model {
    public void breakRules(VijayDeverakonda rowdy) {
        rowdy.walk();
        rowdy.pose();
        rowdy.dance();
        rowdy.display();
        rowdy.design();

        if (rowdy instanceof Model) {
            rowdy.vijay();
            System.out.println("Casting Rowdy...");
        }
    }
}
