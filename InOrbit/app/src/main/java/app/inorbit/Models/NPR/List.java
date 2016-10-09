
package app.inorbit.Models.NPR;

import java.util.ArrayList;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class List {

    @SerializedName("title")
    @Expose
    private Title title;
    @SerializedName("teaser")
    @Expose
    private Teaser teaser;
    @SerializedName("miniTeaser")
    @Expose
    private MiniTeaser miniTeaser;
    @SerializedName("link")
    @Expose
    private java.util.List<Link> link = new ArrayList<Link>();
    @SerializedName("story")
    @Expose
    private java.util.List<Story> story = new ArrayList<Story>();

    /**
     * 
     * @return
     *     The title
     */
    public Title getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(Title title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The teaser
     */
    public Teaser getTeaser() {
        return teaser;
    }

    /**
     * 
     * @param teaser
     *     The teaser
     */
    public void setTeaser(Teaser teaser) {
        this.teaser = teaser;
    }

    /**
     * 
     * @return
     *     The miniTeaser
     */
    public MiniTeaser getMiniTeaser() {
        return miniTeaser;
    }

    /**
     * 
     * @param miniTeaser
     *     The miniTeaser
     */
    public void setMiniTeaser(MiniTeaser miniTeaser) {
        this.miniTeaser = miniTeaser;
    }

    /**
     * 
     * @return
     *     The link
     */
    public java.util.List<Link> getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(java.util.List<Link> link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The story
     */
    public java.util.List<Story> getStory() {
        return story;
    }

    /**
     * 
     * @param story
     *     The story
     */
    public void setStory(java.util.List<Story> story) {
        this.story = story;
    }

}
