package com.problem1.connection;

public class GSM implements Connection {
    public GSM() {
        System.out.println("GSM Module connection has been added to the system.");
    }

    @Override
    public String getType() {
        return "Internet Connection : SIM Card";
    }

}
