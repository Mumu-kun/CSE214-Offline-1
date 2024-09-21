package com.problem2.factory;

import com.problem2.account.Account;
import com.problem2.account.RegularAccount;
import com.problem2.loan.Loan;
import com.problem2.loan.RegularLoan;

public class RegularOperationFactory implements OperationFactory {
    @Override
    public Account createAccount(double balance) {
        return new RegularAccount(balance);
    }

    @Override
    public Loan createLoan(double balance) {
        return new RegularLoan(balance);
    }

}
