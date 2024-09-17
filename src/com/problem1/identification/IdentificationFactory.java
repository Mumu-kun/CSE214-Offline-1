package com.problem1.identification;

import com.problem1.enums.IDType;

public class IdentificationFactory {
    public Identification getIdentification(IDType idType) {
        switch (idType) {
            case RFID:
                return new RFID();
            case NFC:
                return new NFC();
            default:
                throw new IllegalArgumentException("Invalid Identification Type");
        }

    }
}
