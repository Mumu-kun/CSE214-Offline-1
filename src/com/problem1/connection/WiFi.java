package com.problem1.connection;

public class WiFi implements Connection {
    public WiFi() {
        System.out.println("WiFi connection has been added to the system.");
    }

    @Override
    public String getType() {
        return "Internet Connection : WiFi";
    }

}
