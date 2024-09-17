package com.problem1.systemPackage;

import com.problem1.PaymentTerminal;
import com.problem1.connection.Connection;
import com.problem1.controller.Controller;
import com.problem1.displayUnit.DisplayUnit;
import com.problem1.enums.PackageType;
import com.problem1.identification.Identification;
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

    public PackageType getName() {
        return name;
    }

    public DisplayUnit getDisplayUnit() {
        return displayUnit;
    }

    public Identification getIdentification() {
        return identification;
    }

    public PaymentTerminal getPaymentTerminal() {
        return paymentTerminal;
    }

    public Connection getConnection() {
        return connection;
    }

    public Storage getStorage() {
        return storage;
    }

    public Controller getController() {
        return controller;
    }

    public Server getServer() {
        return server;
    }

    public void setName(PackageType name) {
        this.name = name;
    }

    public void setDisplayUnit(DisplayUnit displayUnit) {
        this.displayUnit = displayUnit;
    }

    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    public void setPaymentTerminal(PaymentTerminal paymentTerminal) {
        this.paymentTerminal = paymentTerminal;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public void printDetails() {
        System.out.println("Package Type : " + name);
        System.out.println(displayUnit.getType());
        System.out.println(identification.getType());
        System.out.println(connection.getType());
        System.out.println(storage.getType());
        System.out.println(controller.getType());
        System.out.println(server.getType());
    }
}
