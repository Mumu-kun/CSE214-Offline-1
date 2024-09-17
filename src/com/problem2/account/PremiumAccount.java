package com.problem2.account;

public class PremiumAccount extends Account {

    public PremiumAccount(double balance) {
        this.balance = balance;
        this.interestRate = 3.5 / 100;
    }
}
