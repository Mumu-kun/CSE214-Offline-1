package com.problem2;

import java.util.Scanner;

import com.problem2.account.Account;
import com.problem2.factory.OperationFactory;
import com.problem2.factory.PremiumOperationFactory;
import com.problem2.factory.RegularOperationFactory;
import com.problem2.factory.VIPOperationFactory;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                Select Customer Type:
                    1. Regular
                    2. Premium
                    3. VIP""");

        Integer customerType = null;

        while (customerType == null) {
            try {
                customerType = Integer.parseInt(scanner.nextLine());

                if (customerType < 1 || customerType > 3) {
                    customerType = null;
                    System.out.println("Invalid input.");
                }

            } catch (NumberFormatException e) {
                customerType = null;
                System.out.println("Invalid input.");
            }
        }
        System.out.println();

        OperationFactory operationFactory;

        switch (customerType) {
            case 1:
                operationFactory = new RegularOperationFactory();
                break;
            case 2:
                operationFactory = new PremiumOperationFactory();
                break;
            case 3:
                operationFactory = new VIPOperationFactory();
                break;

            default:
                return;
        }

        System.out.println("""
                Select Operation:
                    1. Savings Account
                    2. Loan""");

        Integer operationType = null;

        while (operationType == null) {
            try {
                operationType = Integer.parseInt(scanner.nextLine());

                if (operationType < 1 || operationType > 2) {
                    operationType = null;
                    System.out.println("Invalid input.");
                }

            } catch (NumberFormatException e) {
                operationType = null;
                System.out.println("Invalid input.");
            }
        }
        System.out.println();

        System.out.print("Enter Principle Amount : ");
        double principle = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter Duration in Years : ");
        int years = Integer.parseInt(scanner.nextLine());

        Operation operation = null;

        switch (operationType) {
            case 1:
                operation = operationFactory.createAccount(principle);
                break;
            case 2:
                operation = operationFactory.createLoan(principle);
                break;

            default:
                return;
        }

        System.out.printf("%s Details :\n", operation instanceof Account ? "Account" : "Loan");
        System.out.printf("%s : %.2f\n", operation instanceof Account ? "Balance" : "Loaned", operation.getBalance());
        System.out.printf("Interest Rate : %.2f%%\n", operation.getInterestRate() * 100);
        System.out.printf("Interest Amount after %d years : %.2f\n", years, operation.calculateInterest(years));
        System.out.printf("Total %s after %d years : %.2f\n",
                operation instanceof Account ? "Balance" : "Payment", years, operation.calculateInterestTotal(years));

        scanner.close();
    }
}
