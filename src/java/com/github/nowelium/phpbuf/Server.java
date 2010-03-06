package com.github.nowelium.phpbuf;

import java.util.concurrent.Executors;

import com.github.nowelium.phpbuf.ExampleSearch.SearchService;
import com.googlecode.protobuf.socketrpc.SocketRpcServer;

public class Server {
    
    public static void main(String...args){
        SocketRpcServer server = new SocketRpcServer(12345, Executors.newCachedThreadPool());
        server.registerBlockingService(SearchService.newReflectiveBlockingService(new SearchServiceImpl()));
        try {
            server.startServer();
            
            synchronized(server){
                server.wait();
            }
        } catch(InterruptedException e){
            // nop
        } finally {
            server.shutDown();
        }
    }

}
