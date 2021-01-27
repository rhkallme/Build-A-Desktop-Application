package org.phxrhk.shiplog;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.awt.*;

/**
 *    RHK 01/26/21
 */

public class ShipLog {

    static Logger log = Logger.getLogger(ShipLog.class);

    public static void main(String[] args) {

        PropertyConfigurator.configure("log4j2.xml");
        log.info("***** Build An Application - Ship Log started *****");

        EventQueue.invokeLater(new Runnable() {     // set up for thread for Swing display
            @Override
            public void run() {
                System.out.println("\nShip Log Applications");
            }
        });
    }
}