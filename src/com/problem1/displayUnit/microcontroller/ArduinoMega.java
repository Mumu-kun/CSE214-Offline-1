package com.problem1.displayUnit.microcontroller;

import java.util.List;

import com.problem1.enums.ConnectionType;
import com.problem1.enums.IDType;

public class ArduinoMega implements Microcontroller {

    public ArduinoMega() {
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
        return "Microcontroller Type : Arduino Mega";
    }
}
