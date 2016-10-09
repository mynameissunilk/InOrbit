
package app.inorbit.Models.NPR;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Story {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("link")
    @Expose
    private List<Link_> link = new ArrayList<Link_>();
    @SerializedName("title")
    @Expose
    private Title_ title;
    @SerializedName("storyDate")
    @Expose
    private StoryDate storyDate;
    @SerializedName("text")
    @Expose
    private Text text;
    @SerializedName("image")
    @Expose
    private List<Image> image = new ArrayList<Image>();

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The link
     */
    public List<Link_> getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(List<Link_> link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The title
     */
    public Title_ getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(Title_ title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The storyDate
     */
    public StoryDate getStoryDate() {
        return storyDate;
    }

    /**
     * 
     * @param storyDate
     *     The storyDate
     */
    public void setStoryDate(StoryDate storyDate) {
        this.storyDate = storyDate;
    }

    /**
     * 
     * @return
     *     The text
     */
    public Text getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(Text text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The image
     */
    public List<Image> getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(List<Image> image) {
        this.image = image;
    }

}
