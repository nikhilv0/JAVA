package com.xworkz.AccessSpecifer;

public class Owner {
    House house;

   public Owner(House house){
      this.house=house;

  }
  public void ownerdisplay(){
      System.out.println("Contactnum:"+this.house.contactNo);
      this.house.design();

  }
}
