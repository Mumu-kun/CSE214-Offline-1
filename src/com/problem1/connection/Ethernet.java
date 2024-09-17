package com.problem1.connection;

public class Ethernet implements Connection {
    public Ethernet() {
        System.out.println("Ethernet connection has been added to the system.");
    }

    @Override
    public String getType() {
        return "Internet Connection : Ethernet";
    }

}
