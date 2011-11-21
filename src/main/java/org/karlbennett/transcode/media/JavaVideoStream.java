package org.karlbennett.transcode.media;


/**
 * User: karl
 * Date: 21/11/11
 */
public class JavaVideoStream extends JavaMediaStream implements VideoStream {

    private int width;
    private int height;
    private int framerate;


    public JavaVideoStream(String mimeType, int width, int height, int framerate) {
        super(mimeType);

        this.width = width;
        this.height = height;
        this.framerate = framerate;
    }


    public int getWidth() {

        return width;
    }

    public int getHeight() {

        return height;
    }

    public int getFramerate() {

        return framerate;
    }
}
