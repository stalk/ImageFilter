package org.rinmakh.paralel.imegefilter;

import java.awt.image.BufferedImage;

/**
 * @author Rinat_Makhmutov
 */
public class HorizontalWorkStream implements Runnable {

    private int Y_LINE;
    private BufferedImage result;
    private BufferedImage source;

    public HorizontalWorkStream(int y_LINE, BufferedImage source, BufferedImage result) {
        Y_LINE = y_LINE;
        this.result = result;
        this.source = source;
    }

    public void run() {
        for(int x = 0; x<PixelWork.MAX_X; x++){
            int pixel = PixelWork.calculatePixel(x, Y_LINE, 15, source);
            result.setRGB(x,Y_LINE,pixel);
        }
    }
}
