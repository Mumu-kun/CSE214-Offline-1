package com.problem1;

import java.util.List;
import java.util.Scanner;

import com.problem1.enums.ConnectionType;
import com.problem1.enums.ServerType;
import com.problem1.systemPackage.PackageBuilder;
import com.problem1.systemPackage.SystemPackage;

public class Director {

    PackageBuilder packageBuilder;

    public void setPackage(PackageBuilder packageBuilder) {
        this.packageBuilder = packageBuilder;
    }

    private ConnectionType promptConnectionType() {
        List<ConnectionType> connectionTypes = packageBuilder.getAllowedConnectionTypes();

        Scanner scanner = App.scanner;

        System.out.println("\nPlease Choose A Connection Type : ");

        int count = 1;
        for (var connectionType : connectionTypes) {
            System.out.println(count + ". " + connectionType);
            count++;
        }

        String input;
        Integer connectionChoice = null;

        while (connectionChoice == null || connectionChoice < 1 || connectionChoice > connectionTypes.size()) {
            if (connectionChoice != null) {
                System.out.println("Invalid Choice");
            }

            try {
                input = scanner.nextLine();
                connectionChoice = Integer.parseInt(input);
            } catch (Exception e) {
                connectionChoice = null;
                System.out.println("Invalid Choice");
            }
        }

        System.out.println();

        return connectionTypes.get(connectionChoice - 1);
    }

    private ServerType promptServerType() {
        Scanner scanner = App.scanner;

        System.out.println("\nPlease Choose A Web Server : ");

        int count = 1;
        var serverTypes = ServerType.values();
        for (var serverType : serverTypes) {
            System.out.println(count + ". " + serverType);
            count++;
        }

        String input;
        Integer serverChoice = null;

        while (serverChoice == null || serverChoice < 1 || serverChoice > serverTypes.length) {
            if (serverChoice != null) {
                System.out.println("Invalid Choice");
            }

            try {
                input = scanner.nextLine();
                serverChoice = Integer.parseInt(input);
            } catch (Exception e) {
                serverChoice = null;
                System.out.println("Invalid Choice");
            }
        }

        System.out.println();

        return serverTypes[serverChoice - 1];
    }

    public SystemPackage construct() {
        packageBuilder.setDisplayUnit()
                .setIdentification()
                .setPaymentTerminal();

        ConnectionType connectionType = promptConnectionType();

        packageBuilder.setConnection(connectionType)
                .setControllerUnit();

        ServerType serverType = promptServerType();
        packageBuilder.setServer(serverType)
                .setStorage();

        return packageBuilder.getPackage();
    }
}
