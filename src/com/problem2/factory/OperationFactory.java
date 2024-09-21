package com.problem2.factory;

import com.problem2.account.Account;
import com.problem2.loan.Loan;

public interface OperationFactory {
    public Account createAccount(double balance);

    public Loan createLoan(double balance);
}
