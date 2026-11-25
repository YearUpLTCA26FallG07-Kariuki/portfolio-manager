package com.pluralsight.finance;

// represents gold as a physical asset with a measurable weight
public class Gold extends FixedAsset {

    private double weight;

    // creates a gold asset with its name, market value, and weight
    public Gold(String name, double marketValue,