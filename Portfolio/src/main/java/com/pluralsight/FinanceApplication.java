package com.pluralsight;

import com.pluralsight.finance.*;

import java.util.Scanner;

public class FinanceApplication {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();

        // Fixed assets
        House house = new House(1996, 7, 5600);
        Gold gold = new Gold( 30);
        Jewelry ring = new Jewelry("Wedding Ring", 5000);

        // Liquid assets
        BankAccount bank = new BankAccount("My Bank", "123", 8000);
        CreditCard card = new CreditCard("Visa", "456", 1200); // you owe $1200

        // Add all to portfolio
        portfolio.addValuable(house);
        portfolio.addValuable(gold);
        portfolio.addValuable(ring);
        portfolio.addValuable(bank);
        portfolio.addValuable(card);

        // Show each item value
        portfolio.showValuables();

        // Total Net Worth
        System.out.println("Total Portfolio Value: $" + portfolio.getValue());

        //Prompt user to add a new asset to the portfolio.
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Would you like to add new asset to the portfolio? \n Y(Yes) / N(No) ");
        String choice = myScanner.nextLine();
        if(choice.equalsIgnoreCase("Y")){

        }
    }
}
