package com.problem1.storage;

public class SDCard implements Storage {
    public SDCard() {
        System.out.println("SD Card Storage has been added to the system.");
    }

    @Override
    public String getType() {
        return "Storage Type : SDCard";
    }

}
