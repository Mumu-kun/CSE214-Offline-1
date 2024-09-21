package com.problem2.factory;

import com.problem2.account.Account;
import com.problem2.account.PremiumAccount;
import com.problem2.loan.Loan;
import com.problem2.loan.PremiumLoan;

public class PremiumOperationFactory implements OperationFactory {
    @Override
    public Account createAccount(double balance) {
        return new PremiumAccount(balance);
    }

    @Override
    public Loan createLoan(double balance) {
        return new PremiumLoan(balance);
    }

}
