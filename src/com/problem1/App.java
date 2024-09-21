package com.problem1;

import java.util.Scanner;

import com.problem1.systemPackage.PackageBuilder;
import com.problem1.systemPackage.SystemPackage;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("""
                \nPlease Choose A Package :
                    1. Basic - ATMega32 with LCD display
                    2. Intermediate - Arduino Mega with LED display
                    3. Advanced - Raspberry Pi with OLED display
                    4. Premium - Raspberry Pi with Touch Screen display""");

        String packageChoice = scanner.nextLine();
        System.out.println();

        Director director = new Director();
        PackageBuilder packageBuilder = new PackageBuilder();

        switch (packageChoice) {
            case "1":
                director.constructBasicPackage(packageBuilder);
                break;
            case "2":
                director.constructStandardPackage(packageBuilder);
                break;
            case "3":
                director.constructAdvancedPackage(packageBuilder);
                break;
            case "4":
                director.constructPremiumPackage(packageBuilder);
                break;
            default:
                System.out.println("Invalid Choice");
                return;
        }
        System.out.println();

        SystemPackage systemPackage = packageBuilder.build();
        systemPackage.printDetails();

        scanner.close();
    }
}
