package com.xworkz.constant;

public enum DBconstant {
    URL("jdbc:mysql://localhost:3306/pages"),
    USERNAME("root"),
    PASSWORD("Nikki6360");

    private String prop;

    DBconstant(String prop) {
        this.prop = prop;
    }

    public String getProp() {
        return prop;
    }
}
