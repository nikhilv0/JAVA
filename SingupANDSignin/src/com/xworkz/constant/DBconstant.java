package com.xworkz.constant;

public enum DBconstant {
    DRIVER("com.mysql.cj.jdbc.Driver"),
    URL("jdbc:mysql://localhost:3306/pages"),
    URL2("jdbc:mysql://localhost:3306/Blood_Bank"),
    USERNAME("root"),
    PASSWORD("Nikki6360");

    private String value;

    DBconstant(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
