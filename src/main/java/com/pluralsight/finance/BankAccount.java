package com.pluralsight.finance;

import java.math.BigDecimal;

// represents a bank account that holds and manages money
public class BankAccount implements Valuable {

    private String name;
    private int accountNumber;
    private BigDecimal balance;

    // creates a bank account with an owner, account number, and starting balance
    public BankAccount(int accountNumber, String name, BigDecimal balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // adds money to the account balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance.add(BigDecimal.valueOf(amount));
        }
    }

    // removes money from the account when sufficient funds are available
    public void withdraw(double amount) {
        if (amount > 0 && balance.compareTo(BigDecimal.valueOf(amount)) >= 0) {
            balance = balance.subtract(BigDecimal.valueOf(amount));
        }
    }

    // returns the account's current balance as its financial value
    @Override
    public double getValue() {
        return balance.doubleValue();
    }

    // returns the account owner's name
    public String getName() {
        return name;
    }

    // returns the account number
    public int getAccountNumber() {
        return accountNumber;
    }

}
