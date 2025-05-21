package com.pluralsight;

import com.pluralsight.finance.*;//*

import java.util.ArrayList;

public class Portfolio implements Valuable{
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

    // Calculate total value (bank + house - credit card) => get the net value
    public double getValue() {
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

    //Exercise getLeast and most method

    public Valuable getMostValuables() {

        //validation to print null if the list is empty
        if(valuables.isEmpty()){
            return null;
        }
        //from my list first get the first value to start the comparison and store it in box called most
       Valuable most = valuables.get(0);

        //Then loop through the list to and compare line the item in order
        for (Valuable v : valuables) {
            //set a condition to start to compare
            if(v.compareTo(most) > 0 ){
               most = v;
            }
        }
        return most;
    }

    public Valuable getLeastValuables() {
        //validation to print null or return 0 if the list is empty
        if(valuables.isEmpty()){
            return null;
        }
        Valuable least = valuables.get(0);

        for (Valuable v : valuables) {
            if(v.compareTo(least) < 0){
                 least = v;
            }
        }
        return least;
    }

}
