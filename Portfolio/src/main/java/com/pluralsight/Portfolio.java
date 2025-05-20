package com.pluralsight;

import com.pluralsight.finance.*;//*

import java.util.ArrayList;

public class Portfolio {
    //collection of valuable creating a list and hold all of it.
    //Create
    // List of valuables (house, gold, credit card, etc.)

    //Set property of our Portfolio class it's a List.
    private ArrayList<Valuable> valuables;

    //Generate constructor
    public Portfolio() {
        this.valuables = new ArrayList<>();
    }


    //Custom Method
    // Add item to portfolio list
    public void addValuable(Valuable item) {
        valuables.add(item);
    }

    // Calculate total value (bank + house - credit card)
    public double getTotalValue() {
        double total = 0;
        for (Valuable v : valuables) {//foreach item in the list called valuables from the Valuable class store it in v.
            total += v.getValue();// Then get the value that are in v and collect/Add only them and store it as a total.
        }
        return total;
    }

    // Method to show/display  each item’s value
    public void showValuables() {
        for (Valuable v : valuables) {
            System.out.println("Item value: " + v.getValue());
        }
    }
}
