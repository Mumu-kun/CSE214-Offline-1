package com.problem1.webServer;

public class DjangoServer implements Server {
    public DjangoServer() {
        System.out.println("Django Server has been added to the system");
    }

    @Override
    public String getType() {
        return "Server Framework : Django";
    }

}
