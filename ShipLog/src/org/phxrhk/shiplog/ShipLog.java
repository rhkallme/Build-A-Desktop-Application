package org.phxrhk.shiplog;

import java.awt.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShipLog {

    private static Logger logger = LogManager.getLogger(ShipLog.class);

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                logger.error("Logger is configured correctly");

                System.out.println("\nThe start of our application");

                System.out.println("The end of our application");

                logger.warn("Complete now closing down application");
            }
        });
    }
}