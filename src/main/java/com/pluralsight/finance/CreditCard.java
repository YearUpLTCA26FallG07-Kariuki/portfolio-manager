ppackage com.pluralsight.finance;

import java.math.BigDecimal;

// represents a credit card that tracks purchases and payments
public class CreditCard implements Valuable {

    private String name;
    private int accountNumber;
    private BigDecimal balance;

    // creates a credit card with an owner, account number, and starting balance
    public CreditCard(int accountNumber, String name, BigDecimal balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // adds a purchase to the outstanding credit card balance
    public void charge(double amount) {
        if (amount > 0) {
            balance = balance.add(BigDecimal.valueOf(amount));
        }
    }

    // applies a payment to reduce the outstanding balance
    public void pay(double amount) {
        if (amount > 0 && balance.compareTo(BigDecimal.valueOf(amount)) >= 0) {
            balance = balance.subtract(BigDecimal.valueOf(amount));
        }
    }

    // returns the current outstanding balance
    @Override
    public double getValue() {
        return balance.doubleValue();
    }

    // returns the cardholder's name
    public String getName() {
        return name;
    }

    // returns the credit card account number
    public int getAccountNumber() {
        return accountNumber;
    }

}