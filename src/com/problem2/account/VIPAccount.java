package com.problem2.account;

public class VIPAccount extends Account {

    public VIPAccount(double balance) {
        this.balance = balance;
        this.interestRate = 5.0 / 100;
    }

}
