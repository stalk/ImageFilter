package org.rinmakh.paralel.imegefilter;

/**
 * @author Rinat_Makhmutov
 */
public class ARGB {

    int a, r, g, b;

    public ARGB(int p) {
        a = (p >> 24) & 0xff;
        r = (p >> 16) & 0xff;
        g = (p >> 8) & 0xff;
        b = (p & 0xff);
    }

    public ARGB() {
        a = b = r = g = 0;
    }

    public int pixel() {
        return ((a << 24) | (r << 16) | (g << 8) | (b << 0));
    }

    public void summarize(ARGB pixel) {
        //  a = (a + pixel.a);
        r = (r + pixel.r);
        g = (g + pixel.g);
        b = (b + pixel.b);
    }

    public void average(int devisor) {
        //  a = a / devisor;
        r = r / devisor;
        g = g / devisor;
        b = b / devisor;
        r = (r > 255) ? 255 : r;
        g = (g > 255) ? 255 : g;
        b = (b > 255) ? 255 : b;
    }

}
