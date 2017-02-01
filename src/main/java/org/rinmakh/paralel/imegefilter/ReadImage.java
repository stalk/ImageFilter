package org.rinmakh.paralel.imegefilter;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author Rinat_Makhmutov
 */
public class ReadImage {

    public static BufferedImage read(String path) throws IOException {
        File f = new File(path);
        BufferedImage bi = ImageIO.read(f);
        return bi;
    }


}
