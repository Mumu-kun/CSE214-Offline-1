package com.problem1;

import java.util.Scanner;

import com.problem1.systemPackage.AdvancedPackageBuilder;
import com.problem1.systemPackage.BasicPackageBuilder;
import com.problem1.systemPackage.PackageBuilder;
import com.problem1.systemPackage.PremiumPackageBuilder;
import com.problem1.systemPackage.StandardPackageBuilder;
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

        Director director = new Director();
        PackageBuilder packageBuilder = null;

        switch (packageChoice) {
            case "1":
                packageBuilder = new BasicPackageBuilder();
                break;
            case "2":
                packageBuilder = new StandardPackageBuilder();
                break;
            case "3":
                packageBuilder = new AdvancedPackageBuilder();
                break;
            case "4":
                packageBuilder = new PremiumPackageBuilder();
                break;
            default:
                System.out.println("Invalid Choice");
                return;
        }
        System.out.println();

        director.setPackage(packageBuilder);
        SystemPackage createdPackage = director.construct();

        System.out.println();
        createdPackage.printDetails();

        scanner.close();
    }
}
