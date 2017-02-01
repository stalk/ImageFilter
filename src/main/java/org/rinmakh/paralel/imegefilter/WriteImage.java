package org.rinmakh.paralel.imegefilter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author Rinat_Makhmutov
 */
public class WriteImage {

    public static void save(BufferedImage image) throws IOException {
        File out = new File("D:\\Projects\\ImageFilter\\carResult.jpg");
        ImageIO.write(image,"jpg",out);
    }
}
