package com.xworkz.collection.dbconstant;

public enum DBconstant {
    DRIVER("com.mysql.cj.jdbc.Driver"),
    URL("jdbc:mysql://localhost:3306/Payment"),
    USERNAME("root"),
    PASSWORD("Nikki6360");

    private String value;

    private DBconstant(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
