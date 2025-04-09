package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.additonal.MaheshBabu;
import com.xworkz.inheritance.additonal.Model;

public class Prince extends Model {
    public void charmAudience(MaheshBabu mahesh) {
        mahesh.walk();
        mahesh.pose();
        mahesh.dance();
        mahesh.display();
        mahesh.design();

        if (mahesh instanceof Model) {
            mahesh.mahesh();
            System.out.println("Casting Prince...");
        }
    }
}
