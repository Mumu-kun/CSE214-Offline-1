package com.problem1.connection;

public class GSM implements Connection {
    public GSM() {
    }

    @Override
    public String getType() {
        return "Internet Connection : SIM Card";
    }

}
