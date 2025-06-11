package com.xworkz.jsp;

import java.io.Serializable;

public class dto implements Serializable {
           private String name;
           private String password;
    public dto() {
        System.out.println("running dto const");
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
}
