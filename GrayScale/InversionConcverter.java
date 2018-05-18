package GrayScale;
import java.io.*;
import edu.duke.*;

/**
 * Write a description of InversionConcverter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InversionConcverter {
    
    public ImageResource makeInverse(ImageResource inImage) {
        ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());
        
        for (Pixel pixel : outImage.pixels()) {
            Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
            int inverseRed = 255 - inPixel.getRed(); 
            int inverseBleu = 255 - inPixel.getBlue(); 
            int inverseGreen = 255 - inPixel.getGreen();
            pixel.setRed(inverseRed);
            pixel.setBlue(inverseBleu);
            pixel.setGreen(inverseGreen);
        }
        return outImage;
    }
    
    public void selectAndConvertAndSave() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            ImageResource inImage = new ImageResource(f);
            String fname = inImage.getFileName();
            String newName = "inverse-" + fname;
            ImageResource gray = makeInverse(inImage);
            gray.setFileName(newName);
            gray.draw();
            gray.save();
        }
    }
    public void testInverse() {
        ImageResource ir = new ImageResource();
        ImageResource gray = makeInverse(ir);
        gray.draw();
    }
}
