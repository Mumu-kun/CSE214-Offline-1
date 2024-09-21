package com.problem1;

import java.util.List;
import java.util.Scanner;

import com.problem1.connection.Connection;
import com.problem1.connection.ConnectionFactory;
import com.problem1.controller.Controller;
import com.problem1.controller.ControllerFactory;
import com.problem1.displayUnit.DisplayUnit;
import com.problem1.displayUnit.display.Display;
import com.problem1.displayUnit.display.DisplayFactory;
import com.problem1.displayUnit.display.TouchScreen;
import com.problem1.displayUnit.microcontroller.Microcontroller;
import com.problem1.displayUnit.microcontroller.MicrocontrollerFactory;
import com.problem1.displayUnit.microcontroller.RaspberryPi;
import com.problem1.enums.ConnectionType;
import com.problem1.enums.ControllerType;
import com.problem1.enums.DisplayType;
import com.problem1.enums.MicrocontrollerType;
import com.problem1.enums.PackageType;
import com.problem1.enums.ServerType;
import com.problem1.enums.StorageType;
import com.problem1.identification.Identification;
import com.problem1.identification.IdentificationFactory;
import com.problem1.paymentTerminal.PaymentTerminal;
import com.problem1.paymentTerminal.PaymentTerminalFactory;
import com.problem1.storage.Storage;
import com.problem1.storage.StorageFactory;
import com.problem1.systemPackage.PackageBuilder;
import com.problem1.systemPackage.SystemPackage;
import com.problem1.webServer.Server;
import com.problem1.webServer.ServerFactory;

public class Director {
    private MicrocontrollerFactory microcontrollerFactory = new MicrocontrollerFactory();
    private DisplayFactory displayFactory = new DisplayFactory();
    private IdentificationFactory identificationFactory = new IdentificationFactory();
    private PaymentTerminalFactory paymentTerminalFactory = new PaymentTerminalFactory();
    private ConnectionFactory connectionFactory = new ConnectionFactory();
    private ControllerFactory controllerFactory = new ControllerFactory();
    private StorageFactory storageFactory = new StorageFactory();
    private ServerFactory serverFactory = new ServerFactory();

    private ConnectionType promptConnectionType(List<ConnectionType> connectionTypes) {
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

    public PackageBuilder constructBasicPackage(PackageBuilder packageBuilder) {
        Microcontroller microcontroller = microcontrollerFactory.createMicrocontroller(MicrocontrollerType.ATMega32);
        System.out.println(microcontroller.getType() + " has been added to the system");
        Display display = displayFactory.createDisplay(DisplayType.LCD);
        System.out.println(display.getType() + " has been added to the system");
        DisplayUnit displayUnit = new DisplayUnit(microcontroller, display);

        Identification identification = identificationFactory.getIdentification(microcontroller.getAllowedIDType());
        System.out.println(identification.getType() + " has been added to the system");
        PaymentTerminal paymentTerminal = paymentTerminalFactory.getPaymentTerminal();
        System.out.println(paymentTerminal.getType() + " has been added to the system");

        ConnectionType connectionType = promptConnectionType(microcontroller.getAllowedConnectionTypes());
        Connection connection = connectionFactory.createConnection(connectionType);
        System.out.println(connection.getType() + " has been added to the system");

        Controller controller = display instanceof TouchScreen ? (Controller) display
                : controllerFactory.createController(ControllerType.MouseAndKeyboard);
        System.out.println(controller.getType() + " has been added to the system");

        Storage storage = storageFactory.createStorage(
                microcontroller instanceof RaspberryPi ? StorageType.InternalStorage : StorageType.SDCard);
        System.out.println(storage.getType() + " has been added to the system");

        ServerType serverType = promptServerType();
        Server server = serverFactory.createServer(serverType);
        System.out.println(server.getType() + " has been added to the system");

        return packageBuilder.setName(PackageType.Basic)
                .setDisplayUnit(displayUnit)
                .setIdentification(identification)
                .setPaymentTerminal(paymentTerminal)
                .setConnection(connection)
                .setControllerUnit(controller)
                .setStorage(storage)
                .setServer(server);
    }

    public PackageBuilder constructStandardPackage(PackageBuilder packageBuilder) {
        Microcontroller microcontroller = microcontrollerFactory.createMicrocontroller(MicrocontrollerType.ArduinoMega);
        System.out.println(microcontroller.getType() + " has been added to the system");
        Display display = displayFactory.createDisplay(DisplayType.LED);
        System.out.println(display.getType() + " has been added to the system");
        DisplayUnit displayUnit = new DisplayUnit(microcontroller, display);

        Identification identification = identificationFactory.getIdentification(microcontroller.getAllowedIDType());
        System.out.println(identification.getType() + " has been added to the system");
        PaymentTerminal paymentTerminal = paymentTerminalFactory.getPaymentTerminal();
        System.out.println(paymentTerminal.getType() + " has been added to the system");

        ConnectionType connectionType = promptConnectionType(microcontroller.getAllowedConnectionTypes());
        Connection connection = connectionFactory.createConnection(connectionType);
        System.out.println(connection.getType() + " has been added to the system");

        Controller controller = display instanceof TouchScreen ? (Controller) display
                : controllerFactory.createController(ControllerType.MouseAndKeyboard);
        System.out.println(controller.getType() + " has been added to the system");

        Storage storage = storageFactory.createStorage(
                microcontroller instanceof RaspberryPi ? StorageType.InternalStorage : StorageType.SDCard);
        System.out.println(storage.getType() + " has been added to the system");

        ServerType serverType = promptServerType();
        Server server = serverFactory.createServer(serverType);
        System.out.println(server.getType() + " has been added to the system");

        return packageBuilder.setName(PackageType.Standard)
                .setDisplayUnit(displayUnit)
                .setIdentification(identification)
                .setPaymentTerminal(paymentTerminal)
                .setConnection(connection)
                .setControllerUnit(controller)
                .setStorage(storage)
                .setServer(server);
    }

    public PackageBuilder constructAdvancedPackage(PackageBuilder packageBuilder) {
        Microcontroller microcontroller = microcontrollerFactory.createMicrocontroller(MicrocontrollerType.RaspberryPi);
        System.out.println(microcontroller.getType() + " has been added to the system");
        Display display = displayFactory.createDisplay(DisplayType.OLED);
        System.out.println(display.getType() + " has been added to the system");
        DisplayUnit displayUnit = new DisplayUnit(microcontroller, display);

        Identification identification = identificationFactory.getIdentification(microcontroller.getAllowedIDType());
        System.out.println(identification.getType() + " has been added to the system");
        PaymentTerminal paymentTerminal = paymentTerminalFactory.getPaymentTerminal();
        System.out.println(paymentTerminal.getType() + " has been added to the system");

        ConnectionType connectionType = promptConnectionType(microcontroller.getAllowedConnectionTypes());
        Connection connection = connectionFactory.createConnection(connectionType);
        System.out.println(connection.getType() + " has been added to the system");

        Controller controller = display instanceof TouchScreen ? (Controller) display
                : controllerFactory.createController(ControllerType.MouseAndKeyboard);
        System.out.println(controller.getType() + " has been added to the system");

        Storage storage = storageFactory.createStorage(
                microcontroller instanceof RaspberryPi ? StorageType.InternalStorage : StorageType.SDCard);
        System.out.println(storage.getType() + " has been added to the system");

        ServerType serverType = promptServerType();
        Server server = serverFactory.createServer(serverType);
        System.out.println(server.getType() + " has been added to the system");

        return packageBuilder.setName(PackageType.Advanced)
                .setDisplayUnit(displayUnit)
                .setIdentification(identification)
                .setPaymentTerminal(paymentTerminal)
                .setConnection(connection)
                .setControllerUnit(controller)
                .setStorage(storage)
                .setServer(server);
    }

    public PackageBuilder constructPremiumPackage(PackageBuilder packageBuilder) {
        Microcontroller microcontroller = microcontrollerFactory.createMicrocontroller(MicrocontrollerType.RaspberryPi);
        System.out.println(microcontroller.getType() + " has been added to the system");
        Display display = displayFactory.createDisplay(DisplayType.TouchScreen);
        System.out.println(display.getType() + " has been added to the system");
        DisplayUnit displayUnit = new DisplayUnit(microcontroller, display);

        Identification identification = identificationFactory.getIdentification(microcontroller.getAllowedIDType());
        System.out.println(identification.getType() + " has been added to the system");
        PaymentTerminal paymentTerminal = paymentTerminalFactory.getPaymentTerminal();
        System.out.println(paymentTerminal.getType() + " has been added to the system");

        ConnectionType connectionType = promptConnectionType(microcontroller.getAllowedConnectionTypes());
        Connection connection = connectionFactory.createConnection(connectionType);
        System.out.println(connection.getType() + " has been added to the system");

        Controller controller = display instanceof TouchScreen ? (Controller) display
                : controllerFactory.createController(ControllerType.MouseAndKeyboard);
        System.out.println(controller.getType() + " has been added to the system");

        Storage storage = storageFactory.createStorage(
                microcontroller instanceof RaspberryPi ? StorageType.InternalStorage : StorageType.SDCard);
        System.out.println(storage.getType() + " has been added to the system");

        ServerType serverType = promptServerType();
        Server server = serverFactory.createServer(serverType);
        System.out.println(server.getType() + " has been added to the system");

        return packageBuilder.setName(PackageType.Premium)
                .setDisplayUnit(displayUnit)
                .setIdentification(identification)
                .setPaymentTerminal(paymentTerminal)
                .setConnection(connection)
                .setControllerUnit(controller)
                .setStorage(storage)
                .setServer(server);
    }
}
