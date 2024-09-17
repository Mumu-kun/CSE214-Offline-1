package com.problem1.identification;

public class RFID implements Identification {

    public RFID() {
        System.out.println("RFID identification has been added to the system.");
    }

    @Override
    public String getType() {
        return "Identification Type : RFID Card";
    }

}
