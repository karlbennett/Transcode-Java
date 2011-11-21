package org.karlbennett.transcode.media.io;


import org.karlbennett.transcode.media.AudioStream;
import org.karlbennett.transcode.media.MediaContainer;
import org.karlbennett.transcode.media.VideoStream;

import java.util.List;


/**
 * User: karl
 * Date: 21/11/11
 */
public class JavaMediaFile implements MediaFile {

    private String fileUri;
    private MediaContainer mediaContainer;
    private List<AudioStream> audioStreams;
    private List<VideoStream> videoStreams;


    public JavaMediaFile(String fileUri, MediaContainer mediaContainer, List<AudioStream> audioStreams,
                         List<VideoStream> videoStreams) {

        this.fileUri = fileUri;
        this.mediaContainer = mediaContainer;
        this.audioStreams = audioStreams;
        this.videoStreams = videoStreams;
    }


    public String getFileUri() {

        return fileUri;
    }

    public MediaContainer getMediaContainer() {

        return mediaContainer;
    }

    public int getAudioStreamSize() {

        return audioStreams.size();
    }

    public AudioStream getAudioStream(int i) {

        return audioStreams.get(i);
    }

    public int getVideoStreamSize() {

        return videoStreams.size();
    }

    public VideoStream getVideoStream(int i) {

        return videoStreams.get(i);
    }
}
