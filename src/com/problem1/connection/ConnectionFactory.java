package com.problem1.connection;

import com.problem1.enums.ConnectionType;

public class ConnectionFactory {
    public Connection createConnection(ConnectionType connectionType) {
        switch (connectionType) {
            case WiFi:
                return new WiFi();
            case GSM:
                return new GSM();
            case Ethernet:
                return new Ethernet();
            default:
                throw new IllegalArgumentException("Invalid Connection type.");
        }
    }
}
