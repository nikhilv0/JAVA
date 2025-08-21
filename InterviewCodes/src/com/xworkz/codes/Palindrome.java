package com.xworkz.codes;

public class Palindrome {
//    public static void main(String[] args) {
//        StringBuilder name=new StringBuilder("Mam");
//        StringBuilder rev=new StringBuilder(name).reverse();
//
//        System.out.println(rev);
//        if (rev.toString().equalsIgnoreCase(name.toString())){
//            System.out.println(rev+"=="+name);
//            System.out.println("its palindrome");
//        }else System.out.println("its not palindrome");
//    }
    public static void main(String[] args) {
        int num=121;
        int rev=0;
        int same=num;

        while (num>0){
            int digit=num%10; //taking last digit
            rev=rev*10+digit;
            num=num/10;  //remove last digit
        }
        System.out.println(rev);
        if (same==rev){
            System.out.println("palindrome");
        }else System.out.println("not palindrome");
    }

}
