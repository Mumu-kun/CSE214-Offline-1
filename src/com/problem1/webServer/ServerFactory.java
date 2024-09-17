package com.problem1.webServer;

import com.problem1.enums.ServerType;

public class ServerFactory {
    public Server createServer(ServerType serverType) {
        switch (serverType) {
            case NodeJS:
                return new NodeJSServer();
            case Ruby:
                return new RubyServer();
            case Django:
                return new DjangoServer();
            default:
                throw new IllegalArgumentException("Invalid Server Type");
        }
    }
}
