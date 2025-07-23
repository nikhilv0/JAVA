package com.xworkz.optional;

import java.util.Optional;

public class OptionalExamp {

   public Optional<String> getNameByNum(int num){
      int num1=12345;
      if(num1==num){
         return Optional.of("nikhil");
      }
      return Optional.empty();
   }
}
