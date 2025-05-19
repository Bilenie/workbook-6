package com.pluralsight.finance;

public class House extends FixedAsset{

    //
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double marketValue, int yearBuilt, int bedrooms, int squareFeet) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.bedrooms = bedrooms;
        this.squareFeet = squareFeet;
    }

}
