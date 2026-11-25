package com.pluralsight.finance;

// represents a house as a valuable physical asset
public class House extends FixedAsset {

    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    // creates a house with its name, market value, and property details
    public House(String name, double marketValue, int yearBuilt,
                 int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    // returns the year the house was built
    public int getYearBuilt() {
        return yearBuilt;
    }

    // returns the total living area of the house
    public int getSquareFeet() {
        return squareFeet;
    }

    // returns the number of bedrooms
    public int getBedrooms() {
        return bedrooms;
    }

}