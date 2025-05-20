package com.pluralsight.finance;

public class Gold extends FixedAsset {

    private double weight;

    public Gold(double weight) {
        super();
        this.weight = weight;
        this.setMarketValue(this.getValue()) ;
    }
    @Override
    public double getValue() {
        //value of karat (measure how pure gold is ) and multiply by the dollar amount.

        return this.weight * 10;
    }

}
