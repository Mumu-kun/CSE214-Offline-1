package com.problem2.factory;

import com.problem2.InterestType;
import com.problem2.account.Account;
import com.problem2.account.PremiumAccount;
import com.problem2.account.RegularAccount;
import com.problem2.account.VIPAccount;
import com.problem2.loan.Loan;

public class AccountFactory implements OperationFactory {

    @Override
    public Account createAccount(InterestType interestType, double balance) {
        switch (interestType) {
            case Regular:
                return new RegularAccount(balance);
            case Premium:
                return new PremiumAccount(balance);
            case VIP:
                return new VIPAccount(balance);
            default:
                return null;
        }
    }

    @Override
    public Loan createLoan(InterestType interestType, double balance) {
        return null;
    }
}
