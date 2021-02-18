package schule;

import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * The type Bilddrehung.
 */
public class Bilddrehung {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("imposter.png")); //res: 477x640px
        rotate(image);
        reflectHorizontal(image);
        reflectVertical(image);
    }

    private static void rotate(BufferedImage image) throws IOException {
        int newHeight = image.getWidth();
        int newWidth = image.getHeight();
        BufferedImage ninetyDegrees = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x < newWidth; x++) {
            for (int y = newHeight - 1; y >= 0; y--) {
                ninetyDegrees.setRGB(x, y, image.getRGB(y, x));
            }
        }
        ImageIO.write(ninetyDegrees, "png", new File("ninetyDegrees.png"));
    }

    private static void reflectHorizontal(BufferedImage image) throws IOException {
        int newHeight = image.getHeight();
        int newWidth = image.getWidth();
        BufferedImage ninetyDegrees = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x < newWidth; x++) {
            for (int y = 0; y < newHeight/2; y++) {
                int temp = image.getRGB(newWidth-x-1, newHeight-y-1);
                ninetyDegrees.setRGB(x, newHeight-y-1, image.getRGB(x, y));
                ninetyDegrees.setRGB(newWidth-x-1, y, temp);
            }
        }
        ImageIO.write(ninetyDegrees, "png", new File("reflectHorizontal.png"));
    }

    private static void reflectVertical(BufferedImage image) throws IOException {
        int newHeight = image.getHeight();
        int newWidth = image.getWidth();
        BufferedImage ninetyDegrees = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x <= newWidth/2; x++) {
            for (int y = 0; y < newHeight; y++) {
                //0/0 -> 100/0;
                int temp = image.getRGB(newWidth-x-1, y);
                ninetyDegrees.setRGB(newWidth-x-1, y, image.getRGB(x, y));
                ninetyDegrees.setRGB(x, y, temp);
            }
        }
        ImageIO.write(ninetyDegrees, "png", new File("reflectVertical.png"));
    }
}