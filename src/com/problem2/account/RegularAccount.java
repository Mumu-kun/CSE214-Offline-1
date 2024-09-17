package com.problem2.account;

public class RegularAccount extends Account {

    public RegularAccount(double balance) {
        this.balance = balance;
        this.interestRate = 2.5 / 100;
    }
}
