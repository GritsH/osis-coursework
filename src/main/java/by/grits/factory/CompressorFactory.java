package by.grits.factory;

import by.grits.imageCompression.ImageLossyCompressor;
import by.grits.videoCompression.VideoCompressor;

public class CompressorFactory {
    private static final CompressorFactory instance = new CompressorFactory();

    private final ImageLossyCompressor imageLossyCompressor;
    private final VideoCompressor videoCompressor;

    public CompressorFactory() {
        imageLossyCompressor = new ImageLossyCompressor();
        videoCompressor = new VideoCompressor();
    }

    public static CompressorFactory getInstance() {
        return instance;
    }

    public ImageLossyCompressor getImageLossyCompressor() {
        return imageLossyCompressor;
    }

    public VideoCompressor getVideoCompressor() {
        return videoCompressor;
    }
}
