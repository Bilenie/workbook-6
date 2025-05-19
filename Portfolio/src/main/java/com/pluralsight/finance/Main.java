package com.pluralsight.finance;

public class Main {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();

        // Fixed assets
        House house = new House("My House", 250000, 2005, 3, 1800);
        Gold gold = new Gold("Gold Coins", 3000, 10);
        Jewelry ring = new Jewelry("Wedding Ring", 5000, 24);

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
        System.out.println("Total Portfolio Value: $" + portfolio.getTotalValue());
    }
}
