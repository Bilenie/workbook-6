package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    //collection of valuable creating a list and hold all of it.
    //Create
    // List of valuables (house, gold, credit card, etc.)
    private List<Valuable> valuables;

    public Portfolio() {
        this.valuables = new ArrayList<>();
    }

    // Add item to portfolio
    public void addValuable(Valuable item) {
        valuables.add(item);
    }

    // Calculate total value (bank + house - credit card)
    public double getTotalValue() {
        double total = 0;
        for (Valuable v : valuables) {
            total += v.getValue();
        }
        return total;
    }
    // Optional: show each item’s value
    public void showValuables() {
        for (Valuable v : valuables) {
            System.out.println("Item value: " + v.getValue());
        }
    }
}
