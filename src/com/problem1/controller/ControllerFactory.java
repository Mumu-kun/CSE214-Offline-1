package com.problem1.controller;

import com.problem1.enums.ControllerType;

public class ControllerFactory {
    public Controller createController(ControllerType controllerType) {
        switch (controllerType) {
            case MouseAndKeyboard:
                return new MouseAndKeyboard();
            default:
                throw new IllegalArgumentException("Invalid Controller Type");
        }
    }
}
