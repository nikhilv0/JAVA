package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.JrNTR;
import com.xworkz.inheritance.additonal.Model;

public class YoungTiger extends Model {
    public void roar(JrNTR jrntr) {
        jrntr.walk();
        jrntr.pose();
        jrntr.dance();
        jrntr.display();
        jrntr.design();

        if (jrntr instanceof Model) {
            jrntr.ntr();
            System.out.println("Casting YoungTiger...");
        }
    }
}
