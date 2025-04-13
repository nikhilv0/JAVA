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
    @Override
    public int hashCode() {
        return 90;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof BankAccount){
                BankAccount bank=this;
                BankAccount bank2=(BankAccount) obj;
                if (bank.accountNumber.equals(bank2.accountNumber)){
                    return true;
                }
            }
        }
        return false;
    }
}
