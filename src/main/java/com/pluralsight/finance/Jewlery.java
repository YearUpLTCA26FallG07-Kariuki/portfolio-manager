package com.pluralsight.finance;

// represents jewelry as a valuable physical asset
public class Jewelry extends FixedAsset {

    private double karat;

    // creates a jewelry asset with its name, value, and karat
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    // returns the jewelry's karat
    public double getKarat() {
        return karat;
    }

}