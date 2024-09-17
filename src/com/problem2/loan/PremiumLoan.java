package com.problem2.loan;

public class PremiumLoan extends Loan {
    public PremiumLoan(double balance) {
        this.balance = balance;
        this.interestRate = 12.0 / 100;
    }
}
