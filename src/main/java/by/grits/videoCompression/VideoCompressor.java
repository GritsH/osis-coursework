package by.grits.videoCompression;

import io.github.techgnious.IVCompressor;
import io.github.techgnious.dto.IVSize;
import io.github.techgnious.dto.ResizeResolution;
import io.github.techgnious.dto.VideoFormats;
import io.github.techgnious.exception.VideoException;

import java.io.File;
import java.io.IOException;

public class VideoCompressor {

    public void compressVideo(String videoPath) throws IOException, VideoException {
        IVCompressor compressor = new IVCompressor();
        File file = new File(videoPath);
        compressor.reduceVideoSizeAndSaveToAPath(file, VideoFormats.MP4, ResizeResolution.R480P, "D:/Testing/Custome");
    }

}
