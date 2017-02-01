package org.rinmakh.paralel.imegefilter;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Rinat_Makhmutov
 */
public class Application {

    private static String PATH = "D:\\Projects\\ImageFilter\\car2.jpeg";

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Start!!!!");

        BufferedImage bi = ReadImage.read(PATH);
        PixelWork.MAX_X = bi.getWidth();
        PixelWork.MAX_Y = bi.getHeight();
        BufferedImage result = new BufferedImage(PixelWork.MAX_X,PixelWork.MAX_Y, bi.getType());

        ExecutorService executors = Executors.newFixedThreadPool(100);
        for(int y=0; y< PixelWork.MAX_Y; y++){
            executors.submit(new HorizontalWorkStream(y,bi,result));
        }

        executors.shutdown();
        while ( !executors.isTerminated()){
           Thread.sleep(1000);
        }

        WriteImage.save(result);


        System.out.println("END!!!!");


    }
}
