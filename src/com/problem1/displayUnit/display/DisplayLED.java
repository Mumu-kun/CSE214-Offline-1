package com.problem1.displayUnit.display;

public class DisplayLED implements Display {

    public DisplayLED() {
        System.out.println("LED display has been added to the system.");
    }

    @Override
    public String getType() {
        return "Display Type: LED";
    }

}
