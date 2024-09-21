package com.problem1.displayUnit.display;

import com.problem1.controller.Controller;

public class TouchScreen implements Display, Controller {
    public TouchScreen() {
    }

    @Override
    public String getType() {
        return "Display and Controller Type: Touch Screen";
    }

}
