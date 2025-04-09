package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.internal.Configuration;
import com.xworkz.inheritance.internal.Resource;

public class Configure extends Resource {
    public void configure(Configuration configuration){
        configuration.release();
        configuration.getInfo();
        configuration.save();
        configuration.refresh();
        configuration.load();
        if (configuration instanceof Resource){
            Resource resource=(Resource) configuration;
            System.out.println("running Noise casting class");
            configuration.setInfo();
        }
    }
}
