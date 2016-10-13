package app.inorbit.Models.Twitter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by owlslubic on 10/13/16.
 */

public class Media_ {
    @SerializedName("media_url")
    @Expose
    private String mediaUrl;


    /**
     *
     * @return
     * The mediaUrl
     */
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     *
     * @param mediaUrl
     * The media_url
     */
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }
}
