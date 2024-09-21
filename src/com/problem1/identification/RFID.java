package com.problem1.identification;

public class RFID implements Identification {

    public RFID() {
    }

    @Override
    public String getType() {
        return "Identification Type : RFID Card";
    }

}
