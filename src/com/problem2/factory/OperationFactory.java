package com.problem2.factory;

import com.problem2.InterestType;
import com.problem2.account.Account;
import com.problem2.loan.Loan;

public interface OperationFactory {
    public Account createAccount(InterestType interestType, double balance);

    public Loan createLoan(InterestType interestType, double balance);
}
