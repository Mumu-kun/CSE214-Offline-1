package com.problem1.systemPackage;

import com.problem1.connection.Connection;
import com.problem1.controller.Controller;
import com.problem1.displayUnit.DisplayUnit;
import com.problem1.enums.PackageType;
import com.problem1.identification.Identification;
import com.problem1.paymentTerminal.PaymentTerminal;
import com.problem1.storage.Storage;
import com.problem1.webServer.Server;

public class PackageBuilder {
    private PackageType name;
    private DisplayUnit displayUnit;
    private Identification identification;
    private PaymentTerminal paymentTerminal;
    private Connection connection;
    private Storage storage;
    private Controller controller;
    private Server server;

    public PackageBuilder setName(PackageType name) {
        this.name = name;

        return this;
    };

    public PackageBuilder setDisplayUnit(DisplayUnit displayUnit) {
        this.displayUnit = displayUnit;

        return this;
    };

    public PackageBuilder setIdentification(Identification identification) {
        this.identification = identification;

        return this;
    };

    public PackageBuilder setPaymentTerminal(PaymentTerminal paymentTerminal) {
        this.paymentTerminal = paymentTerminal;

        return this;
    };

    public PackageBuilder setConnection(Connection connection) {
        this.connection = connection;

        return this;
    }

    public PackageBuilder setControllerUnit(Controller controller) {
        this.controller = controller;

        return this;
    }

    public PackageBuilder setStorage(Storage storage) {
        this.storage = storage;

        return this;
    }

    public PackageBuilder setServer(Server server) {
        this.server = server;

        return this;
    }

    public SystemPackage build() {
        return new SystemPackage(
                this.name,
                this.displayUnit,
                this.identification,
                this.paymentTerminal,
                this.connection,
                this.storage,
                this.controller,
                this.server);
    };

}
