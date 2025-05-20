package com.pluralsight.finance;

public class Jewelry extends FixedAsset  {

    //Set the attribute of this class specific
    private double karat;

    //Generate Constructor
    public Jewelry(String name, double karat) {
        super(name);
        this.karat = karat;
        this.setMarketValue(this.getValue()) ;
    }

    @Override
    public double getValue() {
        //value of karat (measure how pure gold is ) and multiply by the dollar amount.

        return this.karat * 120;
    }
    //we don't need to write the method getValue it is automatically inherited
}
