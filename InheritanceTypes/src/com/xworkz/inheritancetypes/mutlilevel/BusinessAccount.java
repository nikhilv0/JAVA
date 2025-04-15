package com.xworkz.inheritancetypes.mutlilevel;

public class BusinessAccount extends BankAccount {
    public void transferFunds() {
        System.out.println("Transferring funds from business account");
    }
}
