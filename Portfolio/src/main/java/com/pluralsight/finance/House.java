package com.pluralsight.finance;

public class House extends FixedAsset {

    //Set the attribute of this class specific
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    //Generate Constructor
    public House( int yearBuilt, int bedrooms, int squareFeet) {
        super();
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

}
