package com.problem1.webServer;

public class NodeJSServer implements Server {
    public NodeJSServer() {
        System.out.println("NodeJS Server has been added to the system");
    }

    @Override
    public String getType() {
        return "Server Framework : NodeJS";
    }

}
