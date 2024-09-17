package com.problem2.factory;

import com.problem2.InterestType;
import com.problem2.account.Account;
import com.problem2.loan.Loan;
import com.problem2.loan.PremiumLoan;
import com.problem2.loan.RegularLoan;
import com.problem2.loan.VIPLoan;

public class LoanFactory implements OperationFactory {
    @Override
    public Account createAccount(InterestType interestType, double balance) {
        return null;
    }

    @Override
    public Loan createLoan(InterestType interestType, double balance) {
        switch (interestType) {
            case Regular:
                return new RegularLoan(balance);
            case Premium:
                return new PremiumLoan(balance);
            case VIP:
                return new VIPLoan(balance);
            default:
                return null;
        }
    }
}
