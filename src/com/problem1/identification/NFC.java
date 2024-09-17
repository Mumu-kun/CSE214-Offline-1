package com.problem1.identification;

public class NFC implements Identification {

    public NFC() {
        System.out.println("NFC identification has been added to the system.");
    }

    public String getType() {
        return "Identification Type : NFC Card";
    }

}
