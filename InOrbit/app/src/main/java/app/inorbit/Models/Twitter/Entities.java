package app.inorbit.Models.Twitter;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Entities {

    @SerializedName("urls")
    @Expose
    private List<Url> urls = new ArrayList<Url>();

    @SerializedName("media")
    @Expose
    private List<Media> media = new ArrayList<Media>();

    /**
     *
     * @return
     * The urls
     */
    public List<Media> getMedia() {
        return media;
    }

    /**
     *
     * @param urls
     * The urls
     */
    public void setMedia(List<Media> media) {
        this.media = media;
    }

    /**
     *
     * @return
     * The urls
     */
    public List<Url> getUrls() {
        return urls;
    }

    /**
     *
     * @param urls
     * The urls
     */
    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    public Entities withUrls(List<Url> urls) {
        this.urls = urls;
        return this;
    }



}