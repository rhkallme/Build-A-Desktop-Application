package org.phxrhk.shiplog.utils;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

/**
 * Created by RHK on 1/27/2021
 */

public class Splashing {

    private static SplashScreen mySplash;
    private static Double splashTextArea;
    private static Double splashProgressArea;
    private static Graphics2D splashGraphics;
    private static Font font;

    public static void aplashInit() {
        mySplash = SplashScreen.getSplashScreen();
        if(mySplash != null) {
            Dimension ssDim = mySplash.getSize();
            int height = ssDim.height;
            int width = ssDim.width;

            // Stake out some area for our status information
            splashTextArea = new Rectangle2D.Double(width * 0.15, height * 0.65,width * 0.75, 14);
            splashProgressArea = new Rectangle2D.Double(width * 0.02, height * 0.85,width * 0.97,7);

            // Create the graphics environment for drawing status information
            splashGraphics = mySplash.createGraphics();
            font = new Font("Dialog",Font.PLAIN,12);
            splashGraphics.setFont(font);

            // Initialize the status info
            splashText("Starting");
            splashProgress(0);

        }
    }

    public static void splashText(String str) {

    }

    public static void splashProgress(int pct) {

    }

    public static void pause(int delay) {

    }
}