package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.internal.Credential;
import com.xworkz.inheritance.internal.Resource;

public class Object extends Resource{
    public void object(Credential credential){
        credential.release();
        credential.getInfo();
        credential.save();
        credential.refresh();
        credential.load();

        if (credential instanceof Resource){
            Resource resource=(Resource) credential;
            System.out.println("running Noise casting class");
            credential.run();
        }
    }
}
