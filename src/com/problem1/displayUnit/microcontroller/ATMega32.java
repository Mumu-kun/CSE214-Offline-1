package com.problem1.displayUnit.microcontroller;

import java.util.List;

import com.problem1.enums.ConnectionType;
import com.problem1.enums.IDType;

public class ATMega32 implements Microcontroller {

    public ATMega32() {
        System.out.println("ATMega32 has been added to the system.");
    }

    @Override
    public IDType getAllowedIDType() {
        return IDType.RFID;
    }

    @Override
    public List<ConnectionType> getAllowedConnectionTypes() {
        return List.of(ConnectionType.WiFi, ConnectionType.GSM);
    }

    @Override
    public String getType() {
        return "Microcontroller Type : ATMega32";
    }
}
