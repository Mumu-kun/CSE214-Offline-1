package com.problem1.controller;

public class MouseAndKeyboard implements Controller {
    public MouseAndKeyboard() {
        System.out.println("Mouse and Keyboard has been added to the system.");
    }

    @Override
    public String getType() {
        return "Controller Type : Mouse and Keyboard";
    }

}
