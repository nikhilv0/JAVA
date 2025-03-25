package com.xworkz.RefAndvar;

import java.util.Date;

public class Portfolio {
    String Ownername;
    String Type;
    String dateCreated;
    Date Updated;

    Portfolio(String Ownername,String Type,String  dateCreated,Date Updated){
        this.Ownername=Ownername;
        this.Type=Type;
        this.dateCreated=dateCreated;
        this.Updated=Updated;

    }
    void Portfoliomethod(){
        System.out.println("Portfolio:");
        System.out.println("Ownername:"+this.Ownername);
        System.out.println("Type"+this.Type);
        System.out.println("dateCreated:"+this.dateCreated);
        System.out.println("Updated:"+this.Updated);

        Detail detail=new Detail("Hickey Aryan",22,"Davanagere",1234567890);
        detail.detailMethod();
    }

}
