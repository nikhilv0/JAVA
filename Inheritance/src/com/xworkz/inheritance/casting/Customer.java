package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.internal.Resource;
import com.xworkz.inheritance.internal.User;

public class Customer extends Resource {
    public void customer(User user){
        user.release();
        user.getInfo();
        user.save();
        user.refresh();
        user.load();

        if (user instanceof Resource){
            Resource resource=(Resource) user;
            System.out.println("running Noise casting class");
            user.compile();
        }
    }
}
