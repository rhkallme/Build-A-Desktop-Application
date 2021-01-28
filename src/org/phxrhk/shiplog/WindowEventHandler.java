package org.phxrhk.shiplog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by RHK on 1/27/2021
 */

public class WindowEventHandler implements WindowListener {
    static Logger logger = LogManager.getLogger(WindowEventHandler.class);
    private JFrame app;

    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        WindowEventHandler.logger = logger;
    }

    public JFrame getApp() {
        return app;
    }

    public void setApp(JFrame app) {
        this.app = app;
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent we) {
        logger.info("window closing");
        if(we.getSource().equals(app)) {
            logger.info("dispose of ShipLog class instance");
            app.dispose();;
        }
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}