package com.xworkz.constant;

public enum DBconstant {
    DRIVER("com.mysql.cj.jdbc.Driver"),
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
