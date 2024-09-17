package com.problem2.loan;

public class RegularLoan extends Loan {
    public RegularLoan(double balance) {
        this.balance = balance;
        this.interestRate = 14.0 / 100;
    }
}
