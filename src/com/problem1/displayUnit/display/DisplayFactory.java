package com.problem1.displayUnit.display;

import com.problem1.enums.DisplayType;

public class DisplayFactory {
    public Display createDisplay(DisplayType displayType) {
        switch (displayType) {
            case LCD:
                return new DisplayLCD();
            case LED:
                return new DisplayLED();
            case OLED:
                return new DisplayOLED();
            case TouchScreen:
                return new TouchScreen();
            default:
                throw new IllegalArgumentException("Invalid Display Type");

        }
    }
}
