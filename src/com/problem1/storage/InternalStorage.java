package com.problem1.storage;

public class InternalStorage implements Storage {
    public InternalStorage() {
        System.out.println("Device has Internal Storage");
    }

    @Override
    public String getType() {
        return "Storage Type : Internal Storage";
    }
}
