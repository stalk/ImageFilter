package org.rinmakh.paralel.imegefilter;

import java.awt.image.BufferedImage;

/**
 * @author Rinat_Makhmutov
 */
public class PixelWork {

    public static int MAX_X;
    public static int MAX_Y;

    public static int calculatePixel(int x, int y, int radius, BufferedImage bi) {
        ARGB rezult = new ARGB(bi.getRGB(x, y));
        int count = 0;

        ARGB tp;

        for (int xt = x - radius;  xt < x + radius; xt++) {
            if (xt >= 0 && xt < MAX_X && xt != x) {
                for (int yt = y - radius; yt < y + radius; yt++) {
                    if (yt >= 0 && yt < MAX_Y && yt != y) {
                        tp = new ARGB(bi.getRGB(xt, yt));
                        rezult.summarize(tp);
                        count++;
                    }
                }
            }
        }

        rezult.average(count);
        return rezult.pixel();
    }


}
