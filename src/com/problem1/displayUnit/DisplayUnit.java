package com.problem1.displayUnit;

import com.problem1.displayUnit.display.Display;
import com.problem1.displayUnit.display.DisplayFactory;
import com.problem1.displayUnit.microcontroller.Microcontroller;
import com.problem1.displayUnit.microcontroller.MicrocontrollerFactory;
import com.problem1.enums.DisplayType;
import com.problem1.enums.MicrocontrollerType;

public class DisplayUnit {
    private Microcontroller microcontroller;
    private Display display;

    public DisplayUnit(MicrocontrollerType microcontroller, DisplayType displayType) {
        MicrocontrollerFactory microcontrollerFactory = new MicrocontrollerFactory();
        this.microcontroller = microcontrollerFactory.createMicrocontroller(microcontroller);

        DisplayFactory displayFactory = new DisplayFactory();
        this.display = displayFactory.createDisplay(displayType);
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
