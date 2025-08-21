package com.xworkz.codes;

public class StringReverse {
    public static void main(String[] args) {
        String name="Nikhil";
        StringBuilder rev= new StringBuilder();
        String original="Nikhil";

        for (int i=name.length()-1;i>=0;i--){
            rev.append(name.charAt(i));
        }
        System.out.println(rev);

    }
}
