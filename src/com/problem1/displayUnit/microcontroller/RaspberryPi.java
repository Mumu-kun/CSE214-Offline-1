package com.problem1.displayUnit.microcontroller;

import java.util.List;

import com.problem1.enums.ConnectionType;
import com.problem1.enums.IDType;

public class RaspberryPi implements Microcontroller {

    public RaspberryPi() {
        System.out.println("Raspberry Pi has been added to the system.");
    }

    @Override
    public IDType getAllowedIDType() {
        return IDType.NFC;
    }

    @Override
    public List<ConnectionType> getAllowedConnectionTypes() {
        return List.of(ConnectionType.WiFi, ConnectionType.GSM, ConnectionType.Ethernet);
    }

    @Override
    public String getType() {
        return "Microcontroller Type : Raspberry Pi";
    }

}
