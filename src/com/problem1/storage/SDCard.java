package com.problem1.storage;

public class SDCard implements Storage {
    public SDCard() {
    }

    @Override
    public String getType() {
        return "Storage Type : SDCard";
    }

}
