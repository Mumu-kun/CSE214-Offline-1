package com.problem1.connection;

public class Ethernet implements Connection {
    public Ethernet() {
    }

    @Override
    public String getType() {
        return "Internet Connection : Ethernet";
    }

}
