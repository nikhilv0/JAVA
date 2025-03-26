package com.xworkz.GetterAndSetter;

public class Cage {
    void DisCAge(){
        Jail jail=new Jail();
        Station station=new Station();
        station.jailDisplay(jail);
        Jail jail1=new Jail();
        jail1.setName("");
        jail1.setJailerName("");
        jail1.setLocation("");
        jail1.setTotalCells(100);
        Jail jail2=new Jail();
        jail2.setName("");
        jail2.setJailerName("");
        jail2.setLocation("");
        jail2.setTotalCells(1000);
        Jail[] jailss={jail1,jail2};
        station.jailArr(jailss);
    }
}
