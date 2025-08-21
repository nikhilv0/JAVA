package com.xworkz.codes;

public class StringReverse {
    public static void main(String[] args) {
        String name="Nikhil";
        StringBuilder rev= new StringBuilder();

        for (int i=name.length()-1;i>=0;i--){
            rev.append(name.charAt(i));
        }
        System.out.println(rev);
    }
}


                                         // Reverse using built-in method
//String str = "madam";
//StringBuilder reversed = new StringBuilder(str).reverse().;
//
//System.out.println("Reversed: " + reversed);
