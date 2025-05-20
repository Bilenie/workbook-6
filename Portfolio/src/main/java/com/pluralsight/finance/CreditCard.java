package com.pluralsight.finance;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
//Custom Method charge(double ), pay (double )

    @Override
    public double getValue() {
        return -balance;
        //credit limit and current balance.
        // Remaining balance or available balance.
    }

    public void charge(double amount) {
        balance += amount;
    }

    public void pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    //Generate getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
