package com.pluralsight.finance;

public class FixedAsset implements Valuable {
    //Create an attribute/Properties
    private String name;
    private double marketValue;

    //Generate Constructor
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    //Generate getter and setter
    public double getValue() {
        return marketValue;
    }

    public String getName() {
        return name;
    }
}
