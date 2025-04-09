package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.Balakrishna;
import com.xworkz.inheritance.additonal.Model;

public class Legend extends Model {
    public void dominateScreen(Balakrishna balakrishna) {
        balakrishna.walk();
        balakrishna.pose();
        balakrishna.dance();
        balakrishna.display();
        balakrishna.design();

        if (balakrishna instanceof Model) {
            balakrishna.bala();
            System.out.println("Casting Legend...");
        }
    }
}
