package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.internal.Resource;
import com.xworkz.inheritance.internal.Session;

public class Record extends Resource {
    public void record(Session session){
        session.release();
        session.getInfo();
        session.save();
        session.refresh();
        session.load();

        if (session instanceof Resource){
            Resource resource=(Resource) session;
            System.out.println("running Noise casting class");
            session.start();
        }
    }
}
