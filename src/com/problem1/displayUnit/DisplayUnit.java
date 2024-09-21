package com.problem1.displayUnit;

import com.problem1.displayUnit.display.Display;
import com.problem1.displayUnit.microcontroller.Microcontroller;

public class DisplayUnit {
    private Microcontroller microcontroller;
    private Display display;

    public DisplayUnit(Microcontroller microcontroller, Display display) {
        this.microcontroller = microcontroller;

        this.display = display;
    }

    public Microcontroller getMicrocontroller() {
        return microcontroller;
    }

    public Display getDisplay() {
        return display;
    }

    public String getType() {
        return "Display Unit :\n\t" +
                display.getType() + "\n\t" +
                microcontroller.getType();
    }
}
