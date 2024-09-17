package com.problem1.displayUnit.microcontroller;

import java.util.List;

import com.problem1.enums.ConnectionType;
import com.problem1.enums.IDType;

public interface Microcontroller {
    public String getType();

    public IDType getAllowedIDType();

    public List<ConnectionType> getAllowedConnectionTypes();
}
