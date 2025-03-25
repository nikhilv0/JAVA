package com.xworkz.GetterAndSetter;

public class MainRunner {
    public static void main(String[] args) {

        Jail jail=new Jail();
        jail.setName("Nikki");
        jail.setLocation("xworkz");
        jail.setJailerName("Kousalya");
        jail.setTotalCells(10);
        Station station=new Station();
        station.jailDisplay(jail);
        System.out.println("____________________________________________________");

        Satellite satellite=new Satellite();
        satellite.setCost(1000000);
        satellite.setType(Type.COMMUNICATION);
        satellite.setLoadCapacity(124.44);
        satellite.setWeight(1323.2f);
        Orbit orbit=new Orbit();
        orbit.orbitDisplay(satellite);
        System.out.println("____________________________________________________");

        Alien alien=new Alien();
        alien.setSeenBy("Katta");
        alien.setSeenDate("1-1-2000");
        alien.setDescribe("Its an Aient");
        UFO ufo=new UFO();
        ufo.UFODispaly(alien);
        System.out.println("____________________________________________________");

        Camera camera=new Camera();
        camera.setBrand("Nikkis");
        camera.setPrice(100000);
        camera.setCamType(CamType.CANON);
        camera.setConnectivity("yes");
        Lens lens=new Lens();
        lens.lenseDisplay(camera);
    }
}
