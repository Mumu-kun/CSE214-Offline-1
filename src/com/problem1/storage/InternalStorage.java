package com.problem1.storage;

public class InternalStorage implements Storage {
    public InternalStorage() {
    }

    @Override
    public String getType() {
        return "Storage Type : Internal Storage";
    }
}
