package org.phxrhk.shiplog.utils;

import java.awt.*;
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

    public static void splashInit() {
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
        if(mySplash != null && mySplash.isVisible() ) {
            // Erase the last status text
            splashGraphics.setPaint(Color.RED);
            splashGraphics.fill(splashTextArea);

            // Get metrics from the graphics
            FontMetrics metrics = splashGraphics.getFontMetrics(font);
            // Get the height of a line of text in this font and render context
            int hgt = metrics.getHeight() - metrics.getDescent();
            // Get the advance of my text in the font and render context
            int adv = metrics.stringWidth(str);

            // Draw the text
            splashGraphics.setPaint(Color.WHITE);
            if(splashTextArea.getMaxX() > adv) {
                // Center the text
                splashGraphics.drawString(str,(int) ((splashTextArea.getMaxX()-adv)/2),
                        (int) (splashTextArea.getY() + hgt - metrics.getDescent()));
            } else {
                // Display text left aligned; text larger than available space

                splashGraphics.drawString(str,(int) (splashTextArea.width + 1),
                        (int) (splashTextArea.getY() + hgt - metrics.getDescent()));
            }

            // Make sure it's displayed
            mySplash.update();
        }
    }

    public static void splashProgress(int pct) {
        if(mySplash != null && mySplash.isVisible()) {
            // Erase the old progress line
            splashGraphics.setPaint(Color.WHITE);  // erase what was there before
            splashGraphics.fill(splashProgressArea);

            // Draw an outline
            splashGraphics.setPaint(Color.BLUE);   // draw Blue line around white
            splashGraphics.draw(splashProgressArea);

            // Calculate the width corresponding to the correct percentage
            int x = (int) splashProgressArea.getMinX();
            int y = (int) splashProgressArea.getMinY();
            int wid = (int) splashProgressArea.getWidth();
            int hgt = (int) splashProgressArea.getHeight();

            int doneWidth = Math.round((pct * wid)/100f);
            doneWidth = Math.max(0,Math.min(doneWidth,wid -1));

            // Fill the done part one pixel smaller than the outline
            splashGraphics.setPaint(Color.BLUE);
            splashGraphics.fillRect(x,y+1,doneWidth,hgt-1);

            // Make sure it's displayed
            mySplash.update();
        }

    }

    public static void pause(int delay) {
        try {
            Thread.sleep(delay);
        }catch (InterruptedException ex) {
            // Ignore it
        }
    }

}