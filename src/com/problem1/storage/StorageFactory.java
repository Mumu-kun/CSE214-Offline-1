package com.problem1.storage;

import com.problem1.enums.StorageType;

public class StorageFactory {
    public Storage createStorage(StorageType storageType) {
        switch (storageType) {
            case SDCard:
                return new SDCard();
            case InternalStorage:
                return new InternalStorage();
            default:
                throw new IllegalArgumentException("Storage Type not supported.");
        }
    }
}
