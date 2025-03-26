package com.xworkz.GetterAndSetter;

import java.util.SortedMap;

public class Station {
    void jailDisplay(Jail jail){
        if(jail!=null) {

//            jail.setName("Nikki");                  this can be doe in another way meaning 1st have set values and display get and call it
//            jail.setLocation("xworkz");
//            jail.setJailerName("Kousalya");
//            jail.setTotalCells(10);

            jail.setName("Nikki");
            jail.setLocation("xworkz");
            jail.setJailerName("Kousalya");
            jail.setTotalCells(10);


            System.out.println("Name:"+jail.getName());
            System.out.println("Location:"+jail.getLocation());
            System.out.println("JailerName:"+jail.getJailerName());
            System.out.println("TotalCells:"+jail.getTotalCells());

        }
    }
    void jailArr(Jail[] jails){
        if (jails!=null){
           for (Jail jail:jails){

               System.out.println("ArrNAme:"+jail.getName());
               System.out.println("ArrJailerName:"+jail.getJailerName());
               System.out.println("Arr location:"+jail.getLocation());
               System.out.println("Arr Total:"+jail.getTotalCells());

           }
        }

    }
}
