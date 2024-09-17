
package com.problem1.webServer;

public class RubyServer implements Server {
    public RubyServer() {
        System.out.println("Ruby Server has been added to the system");
    }

    @Override
    public String getType() {
        return "Server Framework : Ruby";
    }

}
