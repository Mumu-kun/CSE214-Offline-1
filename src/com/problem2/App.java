package com.problem2;

import java.util.Scanner;

import com.problem2.factory.AccountFactory;
import com.problem2.factory.LoanFactory;
import com.problem2.factory.OperationFactory;
import com.problem2.loan.Loan;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                Select Operation:
                    1. Savings Account
                    2. Loan
                    """);

        Integer operation = null;

        while (operation == null) {
            try {
                operation = Integer.parseInt(scanner.nextLine());

                if (operation < 1 || operation > 2) {
                    operation = null;
                    System.out.println("Invalid input.");
                }

            } catch (NumberFormatException e) {
                operation = null;
                System.out.println("Invalid input.");
            }
        }

        OperationFactory operationFactory;

        switch (operation) {
            case 1:
                operationFactory = new AccountFactory();
                break;
            case 2:
                operationFactory = new LoanFactory();
                break;

            default:
                return;
        }

        Operation loan = operationFactory.createAccount(InterestType.Premium, 10000);

        System.out.println("Loan Details:");
        System.out.println("Balance: " + loan.getBalance());
        System.out.println("Interest Rate: " + loan.getInterestRate());
        System.out.println("Interest Amount: " + loan.calculateInterest(20));
        System.out.println("Total Payment: " + loan.calculateInterestTotal(20));
    }

}
