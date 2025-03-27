package com.xworkz.hasasRelation;

import java.util.Date;

public class Warranty {
    private String startDate;
    private String endDate;

    public Warranty(String startDate,String endDate){
        System.out.println("running warranty costruct");
        this.startDate=startDate;
        this.endDate=endDate;

    }

    public void warrantyDisplay(){
        System.out.println("Start date:"+this.startDate);
        System.out.println("End Date:"+this.endDate);

    }
}
