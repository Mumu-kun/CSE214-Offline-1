package com.problem1.systemPackage;

import com.problem1.connection.Connection;
import com.problem1.controller.Controller;
import com.problem1.displayUnit.DisplayUnit;
import com.problem1.enums.PackageType;
import com.problem1.identification.Identification;
import com.problem1.paymentTerminal.PaymentTerminal;
import com.problem1.storage.Storage;
import com.problem1.webServer.Server;

public class SystemPackage {
    private PackageType name;
    private DisplayUnit displayUnit;
    private Identification identification;
    private PaymentTerminal paymentTerminal;
    private Connection connection;
    private Storage storage;
    private Controller controller;
    private Server server;

    public SystemPackage(PackageType name, DisplayUnit displayUnit, Identification identification,
            PaymentTerminal paymentTerminal, Connection connection, Storage storage, Controller controller,
            Server server) {
        this.name = name;
        this.displayUnit = displayUnit;
        this.identification = identification;
        this.paymentTerminal = paymentTerminal;
        this.connection = connection;
        this.storage = storage;
        this.controller = controller;
        this.server = server;
    }

    public void printDetails() {
        System.out.println("Package Type : " + name);
        System.out.println(displayUnit.getType());
        System.out.println(identification.getType());
        System.out.println(paymentTerminal.getType());
        System.out.println(connection.getType());
        System.out.println(storage.getType());
        System.out.println(controller.getType());
        System.out.println(server.getType());
    }
}
