package org.phxrhk.shiplog;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.phxrhk.shiplog.utils.Splashing;

import javax.swing.*;
import java.awt.*;


public class ShipLog extends JFrame{

    static Logger logger = LogManager.getLogger(ShipLog.class);
    private WindowEventHandler window_event_handler;

    public ShipLog() throws HeadlessException {
        logger.info(ShipLog.class + " constructor called");
        this.setTitle("Build Java Applications - Ship Log");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window_event_handler = new WindowEventHandler();
        window_event_handler.setApp(this);
        this.addWindowListener(window_event_handler);
        setBounds(100,100,450,300);
        logger.info(ShipLog.class + "constructor finished");
    }

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        logger.info("***** Build An Application - Ship Log started");

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                Splashing.splashInit();
                Splashing.pause(1000);

                Splashing.splashText("Creating application");
                Splashing.splashProgress(33);
                Splashing.pause(1000);

                Splashing.splashText("Creating application");
                Splashing.splashProgress(66);
                Splashing.pause(1000);

                ShipLog app = new ShipLog();

                Splashing.splashText("Loading data file");
                Splashing.splashProgress(99);
                Splashing.pause(1000);


                app.setVisible(true);

            }
        });
    }
}