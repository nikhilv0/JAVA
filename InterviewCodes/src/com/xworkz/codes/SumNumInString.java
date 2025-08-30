package com.xworkz.codes;

public class SumNumInString {
    public static void main(String[] args) {
        String name="Nik123il456";
        int num=0;

        for (int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if (ch==' '){
                Character ch1=ch;
                System.out.println(ch1);
            }else
            {
                if (ch >= '0' && ch <= '9') {  //  check digit first
                    int digit = ch - '0';      // convert char → int or it will take ascii value
                    num += digit;
                }
            }
//            if (Character.isDigit(ch)){
//                num+=Character.getNumericValue(ch);
//            }
        }
        System.out.println(num);
    }
}
