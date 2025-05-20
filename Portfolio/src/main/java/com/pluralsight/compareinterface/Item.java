package com.pluralsight.compareinterface;

public class Item implements Comparable<Item>{
    private String name;
    private int bonus;

    public Item(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
//we implement the Comparable interface and override the compareTo method now we dont need to pass in we have default sort
    @Override
    public int compareTo(Item otherItem){
        return Integer.compare(this.bonus, otherItem.bonus);
        //return this.getName().compareToIgnoreCase(otherItem.getName());
        // tell it how it will compare it for me.)
    }
}
