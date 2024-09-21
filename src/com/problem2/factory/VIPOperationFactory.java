package com.problem2.factory;

import com.problem2.account.Account;
import com.problem2.account.VIPAccount;
import com.problem2.loan.Loan;
import com.problem2.loan.VIPLoan;

public class VIPOperationFactory implements OperationFactory {
    @Override
    public Account createAccount(double balance) {
        return new VIPAccount(balance);
    }

    @Override
    public Loan createLoan(double balance) {
        return new VIPLoan(balance);
    }

}
