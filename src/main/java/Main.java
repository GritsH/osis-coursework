import by.grits.imageCompression.LossyCompressor;
import by.grits.videoCompression.VideoCompressor;
import io.github.techgnious.exception.VideoException;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, VideoException {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Enter path to the image: ");
        String path = scanner.nextLine();
        LossyCompressor lossyCompressor = new LossyCompressor();
        lossyCompressor.compressImage(path);
        VideoCompressor videoCompressor = new VideoCompressor();
        videoCompressor.compressVideo(path);
    }
}