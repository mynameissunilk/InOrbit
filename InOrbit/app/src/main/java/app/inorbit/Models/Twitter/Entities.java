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