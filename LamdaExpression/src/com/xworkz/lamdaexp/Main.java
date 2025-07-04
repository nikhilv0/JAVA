package com.xworkz.lamdaexp;

public class Main {
    public static void main(String[] args) {
//          optional datatype
//        Bottle bottle=( no)->  (no>0);                1 type
//
//
//         Bottle bottle=(no)-> {
            // if(no>0) return true;`                    2 type
//        return false;
//         };


        Customer customer=new Customer();              // 3 type
        customer.buy((no -> no>0));

    }

}
