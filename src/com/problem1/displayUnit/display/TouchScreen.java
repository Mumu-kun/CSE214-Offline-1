package com.problem1.displayUnit.display;

import com.problem1.controller.Controller;

public class TouchScreen implements Display, Controller {
    public TouchScreen() {
        System.out.println("Touch Screen display has been added to the system.");
    }

    @Override
    public String getType() {
        return "Display and Controller Type: Touch Screen";
    }

}
