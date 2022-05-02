package imageCompression;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Iterator;

public class LossyCompression {

    public void compressImage(String imagePath) throws IOException {
        String[] splitedPath = imagePath.split("([a-zA-Z]:)?(\\\\[a-zA-Z0-9_.-]+)+\\\\?");
        String compressedImageName = splitedPath[splitedPath.length - 1];
        File input = new File(imagePath);
        BufferedImage image = ImageIO.read(input);

        File compressedImageFile = new File("compressed_" + compressedImageName);
        OutputStream os =new FileOutputStream(compressedImageFile);

        Iterator<ImageWriter> writers =  ImageIO.getImageWritersByFormatName("jpg");
        ImageWriter writer = (ImageWriter) writers.next();

        ImageOutputStream ios = ImageIO.createImageOutputStream(os);
        writer.setOutput(ios);

        ImageWriteParam param = writer.getDefaultWriteParam();

        param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        param.setCompressionQuality(0.5f);
        writer.write(null, new IIOImage(image, null, null), param);

        os.close();
        ios.close();
        writer.dispose();
    }
}
