package com.problem1.displayUnit.microcontroller;

import com.problem1.enums.MicrocontrollerType;

public class MicrocontrollerFactory {
    public Microcontroller createMicrocontroller(MicrocontrollerType microcontrollerType) {

        switch (microcontrollerType) {
            case ATMega32:
                return new ATMega32();
            case ArduinoMega:
                return new ArduinoMega();
            case RaspberryPi:
                return new RaspberryPi();
            default:
                throw new IllegalArgumentException("Invalid Microcontroller Type");
        }

    }
}
