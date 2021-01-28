package org.phxrhk.shiplog.menu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by RHK on 1/27/2021
 */

public class MainMenuActionListener implements ActionListener {

    static Logger logger = LogManager.getLogger(MainMenuActionListener.class);
    private JFrame app;

    @Override
    public void actionPerformed(ActionEvent arg0) {

        logger.info("Main event generated " + arg0.toString());

        if(arg0.equals("Exit")) {
            logger.info("Exit button pressed");
            app.dispose();
        }

    }

    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        MainMenuActionListener.logger = logger;
    }

    public JFrame getApp() {
        return app;
    }

    public void setApp(JFrame app) {
        this.app = app;
    }
}