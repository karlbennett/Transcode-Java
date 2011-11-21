package org.karlbennett.transcode.media;


/**
 * User: karl
 * Date: 21/11/11
 */
public class JavaAudioStream extends JavaMediaStream implements AudioStream {

    private int sampleRate;
    private int channels;


    public JavaAudioStream(String mimeType, int sampleRate, int channels) {
        super(mimeType);

        this.sampleRate = sampleRate;
        this.channels = channels;
    }

    public int getSampleRate() {

        return sampleRate;
    }

    public int getChannels() {

        return channels;
    }
}
