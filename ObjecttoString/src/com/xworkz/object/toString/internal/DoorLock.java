package com.xworkz.object.toString.internal;

public class DoorLock {
    private String brand, type;
    private int securityLevel;
    public DoorLock(String brand, String type, int securityLevel) {
        this.brand = brand;
        this.type = type;
        this.securityLevel = securityLevel;
    }
    @Override
    public String toString() {
        return "DoorLock {Brand:" + this.brand + " Type:" + this.type + " SecurityLevel:" + this.securityLevel + "}";
    }
    @Override
    public int hashCode() {
        return 75;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof DoorLock){
                DoorLock doorLock=this;
                DoorLock doorLock2=(DoorLock) obj;
                if (doorLock.brand.equals(doorLock2.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
