package com.playground.api;
import java.net.InetSocketAddress;
import java.io.IOException;

import com.sun.net.httpserver.HttpServer;

public class App 
{
    public static void main( String[] args ) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(9000),0);
        server.start();
        
    }
}
