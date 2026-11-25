package com.pluralsight.finance;

// represents a physical asset that has a measurable market value
public abstract class FixedAsset implements Valuable {

    private String name;
    private double marketValue;

    // initializes an asset with its name and current market value
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    // returns the asset's name
    public String getName() {
        return name;
    }

    // returns the current market value of the asset
    @Override
    public double getValue() {
        return marketValue;
    }
}