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
// if there is not getValue method marketValue super(name, karat * whatever => marketValue)
    @Override
    public double getValue() {
        //value of karat (measure how pure gold is ) and multiply by the dollar amount.
        return this.karat * 120;// this is the marketValue
    }
    //we don't need to write the method getValue it is automatically inherited

    //Generate getter and setter

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }
}
