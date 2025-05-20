package com.pluralsight.finance;

public abstract class FixedAsset implements Valuable {
    //Create an attribute/Properties
    private String name;
    private double marketValue;

    //Generate Constructor > overloading constructor
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public FixedAsset() {

    }

    public FixedAsset(String name) {
        this.name = name ;
    }

    //Implemented the getValue method passed from interface

//    public abstract double getValue();// doesn't necessary defined

    //Generate getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }
}
