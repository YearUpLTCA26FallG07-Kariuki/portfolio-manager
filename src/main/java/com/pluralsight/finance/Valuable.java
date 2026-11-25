package com.pluralsight.finance;

// defines a common feature for anything that has financial value
public interface Valuable {

    // requires implementing classes to provide their value
    double getValue();

}