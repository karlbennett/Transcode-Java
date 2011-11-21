package org.karlbennett.transcode.media;


/**
 * User: karl
 * Date: 21/11/11
 */
public class JavaMediaStream implements MediaStream {

    private String mimeType;


    public JavaMediaStream(String mimeType) {

        this.mimeType = mimeType;
    }


    public String getMimeType() {

        return mimeType;
    }
}
