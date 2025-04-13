package com.xworkz.object.toString.internal;

public class Router {
    private String brand, frequency;
    private int ports;
    public Router(String brand, String frequency, int ports) {
        this.brand = brand;
        this.frequency = frequency;
        this.ports = ports;
    }
    @Override
    public String toString() {
        return "Router {Brand:" + this.brand + " Frequency:" + this.frequency + " Ports:" + this.ports + "}";
    }
    @Override
    public int hashCode() {
        return 30;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Router) {
                Router router=this;
                Router router2=(Router) obj;
                if (router.brand.equals(router2.brand) && router.frequency.equals(router2.frequency) && router.ports==(router2.ports)){
                    return true;
                }
            }
        }
        return false;
    }
}
