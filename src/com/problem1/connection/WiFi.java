package com.problem1.connection;

public class WiFi implements Connection {
    public WiFi() {
    }

    @Override
    public String getType() {
        return "Internet Connection : WiFi";
    }

}
