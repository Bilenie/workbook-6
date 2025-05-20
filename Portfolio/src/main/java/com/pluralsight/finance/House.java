package com.pluralsight.finance;

public class House extends FixedAsset {

    //Set the attribute of this class specific
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    //Generate Constructor
    public House( int yearBuilt, int bedrooms, int squareFeet) {
        super();// super( name,marketValue => squareFeet * 150)
        this.yearBuilt = yearBuilt;
        this.bedrooms = bedrooms;
        this.squareFeet = squareFeet;
        this.setMarketValue(this.getValue()) ;
    }
    @Override
    public double getValue(){
        //calculate value
        return 100.; // add a valid calculation later.
    }

    //Generate getter and setter

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }
}
