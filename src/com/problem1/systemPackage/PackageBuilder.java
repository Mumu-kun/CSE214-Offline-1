package com.problem1.systemPackage;

import java.util.List;

import com.problem1.PaymentTerminal;
import com.problem1.connection.Connection;
import com.problem1.connection.ConnectionFactory;
import com.problem1.controller.Controller;
import com.problem1.controller.ControllerFactory;
import com.problem1.displayUnit.display.Display;
import com.problem1.displayUnit.display.TouchScreen;
import com.problem1.displayUnit.microcontroller.Microcontroller;
import com.problem1.displayUnit.microcontroller.RaspberryPi;
import com.problem1.enums.ConnectionType;
import com.problem1.enums.ControllerType;
import com.problem1.enums.ServerType;
import com.problem1.enums.StorageType;
import com.problem1.identification.Identification;
import com.problem1.identification.IdentificationFactory;
import com.problem1.storage.Storage;
import com.problem1.storage.StorageFactory;
import com.problem1.webServer.Server;
import com.problem1.webServer.ServerFactory;

public abstract class PackageBuilder {

    protected SystemPackage createdPackage;

    abstract public PackageBuilder setDisplayUnit();

    public PackageBuilder setIdentification() {
        Microcontroller microcontroller = this.createdPackage.getDisplayUnit().getMicrocontroller();

        if (microcontroller == null) {
            throw new IllegalStateException("Display Unit must be set before Identification");
        }

        IdentificationFactory identificationFactory = new IdentificationFactory();
        Identification identification = identificationFactory.getIdentification(microcontroller.getAllowedIDType());

        this.createdPackage.setIdentification(identification);
        return this;
    };

    public PackageBuilder setPaymentTerminal() {
        createdPackage.setPaymentTerminal(new PaymentTerminal());

        return this;
    };

    public PackageBuilder setConnection(ConnectionType connectionType) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.createConnection(connectionType);

        this.createdPackage.setConnection(connection);

        return this;
    }

    public PackageBuilder setStorage() {
        Microcontroller microcontroller = this.createdPackage.getDisplayUnit().getMicrocontroller();

        if (microcontroller == null) {
            throw new IllegalStateException("Display Unit must be set before Storage");
        }

        StorageType storageType = StorageType.SDCard;

        if (microcontroller instanceof RaspberryPi) {
            storageType = StorageType.InternalStorage;
        }

        StorageFactory storageFactory = new StorageFactory();
        Storage storage = storageFactory.createStorage(storageType);

        this.createdPackage.setStorage(storage);
        return this;
    }

    public PackageBuilder setControllerUnit() {
        Display display = this.createdPackage.getDisplayUnit().getDisplay();

        if (display == null) {
            throw new IllegalStateException("Display Unit must be set before Controller Unit");
        }

        if (display instanceof TouchScreen) {
            this.createdPackage.setController((Controller) display);
            return this;
        }

        ControllerFactory controllerFactory = new ControllerFactory();
        Controller controller = controllerFactory.createController(ControllerType.MouseAndKeyboard);

        this.createdPackage.setController(controller);
        return this;
    }

    public PackageBuilder setServer(ServerType serverType) {
        ServerFactory serverFactory = new ServerFactory();
        Server server = serverFactory.createServer(serverType);

        this.createdPackage.setServer(server);

        return this;
    }

    public List<ConnectionType> getAllowedConnectionTypes() {
        Microcontroller microcontroller = this.createdPackage.getDisplayUnit().getMicrocontroller();

        if (microcontroller == null) {
            throw new IllegalStateException("Display Unit must be set before Connection");
        }

        return microcontroller.getAllowedConnectionTypes();
    }

    public SystemPackage getPackage() {
        return this.createdPackage;
    };

}
