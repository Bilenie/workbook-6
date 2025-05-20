package com.pluralsight.finance;

public class Jewelry extends FixedAsset {

   private double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }
    //we don't need to write the method getValue it is automatically inherited
}
