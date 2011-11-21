package org.karlbennett.transcode.media;


/**
 * User: karl
 * Date: 21/11/11
 */
public class JavaMediaContainer extends JavaMediaStream implements MediaContainer {

    private String description;


    public JavaMediaContainer(String mimeType, String description) {
        super(mimeType);

        this.description = description;
    }


    public String getDescription() {

        return description;
    }
}
