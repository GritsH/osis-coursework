package by.grits.view;

import by.grits.factory.CompressorFactory;
import by.grits.imageCompression.ImageLossyCompressor;
import by.grits.videoCompression.VideoCompressor;
import io.github.techgnious.exception.VideoException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Menu {
    public static void start() throws IOException, VideoException {
        CompressorFactory compressorFactory = CompressorFactory.getInstance();
        ImageLossyCompressor imageLossyCompressor = compressorFactory.getImageLossyCompressor();
        VideoCompressor videoCompressor = compressorFactory.getVideoCompressor();

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        while (true) {
            printMenu();
            String input = scanner.nextLine();
            switch (input) {
                case "1" -> {
                    System.out.println("Enter image path: ");
                    String imagePath = scanner.nextLine();
                    imageLossyCompressor.compressImage(imagePath);
                }
                case "2" -> {
                    //System.out.println("pattern for input: \ndisk:\pathToImage");
                    System.out.println("Enter video path: ");
                    String videoPath = scanner.nextLine();
                    videoCompressor.compressVideo(videoPath);
                }
                case "e" -> System.exit(0);
                default -> System.out.println("No such command. Try again");
            }
        }
    }

    private static void printMenu() {
        System.out.println("1. Compress image");
        System.out.println("2. Compress video");
        System.out.println("e. Exit");
    }
}
