package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;
import java.math.BigDecimal;

// runs the finance application and demonstrates how interfaces work
public class FinanceApplication {

    public static void main(String[] args) {

        // creates two bank accounts with different owners and starting balances
        BankAccount account1 = new BankAccount(123, "Silvia", new BigDecimal("12500"));

        Valuable account2 = new BankAccount(456, "Drew", new BigDecimal("1500"));

        // adds money to the first account
        account1.deposit(100);

        // account2.deposit(100);
        // this will not compile because Valuable does not define deposit()

        // displays the current values of both accounts
        System.out.println("Silvia's account value: $" + account1.getValue());
        System.out.println("Drew's account value: $" + account2.getValue());
    }
}
