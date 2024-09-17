package com.problem2;

public abstract class Operation {
    protected double balance;
    protected double interestRate;

    public double getInterestRate() {
        return interestRate;
    };

    public double getBalance() {
        return balance;
    };

    public double calculateInterest(Integer years) {
        return calculateInterestTotal(years) - balance;
    }

    public double calculateInterestTotal(Integer years) {
        return balance * Math.pow((1 + interestRate), years);
    }
}
