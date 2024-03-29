package com.mainacad;

import com.mainacad.model.ConnectionInfo;
import com.mainacad.service.ConnectionInfoService;

import java.util.Queue;
import java.util.logging.Logger;

public class AppRunner {

    private static Logger logger = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {
        Queue<ConnectionInfo> connections = ConnectionInfoService.generateConectionInfoQueue(5);

        logger.info("My system generated " + connections.size() + " connections.");

        String connactionAsText = ConnectionInfoService.getConnectionsAsText(connections);
        logger.info("\n" + connactionAsText);
    }
}
