package com.xworkz.object.toString.internal;

public class BankAccount {
    private String accountNumber, holderName;
    private double balance;
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "BankAccount {Account Number: " + this.accountNumber + ", Holder Name: " + this.holderName + ", Balance: $" + this.balance + "}";
    }
}
