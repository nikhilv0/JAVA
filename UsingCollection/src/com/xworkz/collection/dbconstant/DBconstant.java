package com.xworkz.collection.dbconstant;

public enum DBconstant {
    URL(""),
    ROOT(""),
    PASSWORD(""),
    DRIVER("");
    private String value;

    private DBconstant(String value){
        this.value=value;
    }
}
