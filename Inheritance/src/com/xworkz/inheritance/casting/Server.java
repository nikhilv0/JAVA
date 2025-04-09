package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.internal.Network;
import com.xworkz.inheritance.internal.Resource;

public class Server extends Resource {
    public void sevrice(Network network){
        network.release();
        network.getInfo();
        network.save();
        network.refresh();
        network.load();

        if (network instanceof Resource){
            Resource resource=(Resource) network;
            System.out.println("running Noise casting class");
            network.net();
        }
    }
}
