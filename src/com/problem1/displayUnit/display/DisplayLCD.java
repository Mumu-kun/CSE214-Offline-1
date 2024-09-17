package com.problem1.displayUnit.display;

public class DisplayLCD implements Display {

    public DisplayLCD() {
        System.out.println("LCD display has been added to the system.");
    }

    @Override
    public String getType() {
        return "Display Type: LCD";
    }

}
