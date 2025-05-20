package com.pluralsight.finance;

public class House extends FixedAsset {

    //Set the attribute of this class specific
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    //Generate Constructor
    public House(String name, double marketValue, int yearBuilt, int bedrooms, int squareFeet) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.bedrooms = bedrooms;
        this.squareFeet = squareFeet;
    }

}
