package com.pluralsight.finance;

public class BankAccount implements Valuable{

    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Custom Method deposit(double  ), withdraw(double )
    @Override
 public void getValue(){
     System.out.println("");
 }
}
