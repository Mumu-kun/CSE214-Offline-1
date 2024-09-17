package com.problem2.loan;

public class VIPLoan extends Loan {
    public VIPLoan(double balance) {
        this.balance = balance;
        this.interestRate = 10.0 / 100;
    }

}
