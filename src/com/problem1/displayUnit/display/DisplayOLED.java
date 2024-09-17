package com.problem1.displayUnit.display;

public class DisplayOLED implements Display {
    public DisplayOLED() {
        System.out.println("OLED display has been added to the system.");
    }

    @Override
    public String getType() {
        return "Display Type: OLED";
    }

}
