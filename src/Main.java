import imageCompression.LossyCompression;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Enter path to the image: ");
        String path = scanner.nextLine();
        LossyCompression lossyCompression = new LossyCompression();
        lossyCompression.compressImage(path);
    }
}