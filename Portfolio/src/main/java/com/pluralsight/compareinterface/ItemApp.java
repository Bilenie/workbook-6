package com.pluralsight.compareinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemApp {
    public static void main(String[] args) {

        List<Item> myItems = new ArrayList<>();

        myItems.add(new Item("Bilenie", 50));
        myItems.add(new Item("Eyob", 60));
        myItems.add(new Item("Abrish", 70));
        myItems.add(new Item("Heldana", 80));
        myItems.add(new Item("Eden", 90));
        myItems.add(new Item("Asteway", 100));

        Collections.sort(myItems, (a, b) -> Integer.compare(b.getBonus(), a.getBonus()));// Pass second parameter called compare
        Collections.sort(myItems, (a, b) -> a.getName().compareToIgnoreCase(b.getName()));// compare by string

        for(Item i : myItems){
            System.out.println(i.getName() + " - " + i.getBonus() + " ");
        }

    }
}
