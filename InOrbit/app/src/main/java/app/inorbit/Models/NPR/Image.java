
package app.inorbit.Models.NPR;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Image {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("src")
    @Expose
    private String src;
    @SerializedName("hasBorder")
    @Expose
    private String hasBorder;
    @SerializedName("title")
    @Expose
    private Title__ title;
    @SerializedName("caption")
    @Expose
    private Caption caption;
    @SerializedName("link")
    @Expose
    private Link__ link;
    @SerializedName("producer")
    @Expose
    private Producer producer;
    @SerializedName("provider")
    @Expose
    private Provider provider;
    @SerializedName("copyright")
    @Expose
    private Copyright copyright;
    @SerializedName("enlargement")
    @Expose
    private Enlargement enlargement;
    @SerializedName("crop")
    @Expose
    private List<Crop> crop = new ArrayList<Crop>();

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
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The width
     */
    public String getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The src
     */
    public String getSrc() {
        return src;
    }

    /**
     * 
     * @param src
     *     The src
     */
    public void setSrc(String src) {
        this.src = src;
    }

    /**
     * 
     * @return
     *     The hasBorder
     */
    public String getHasBorder() {
        return hasBorder;
    }

    /**
     * 
     * @param hasBorder
     *     The hasBorder
     */
    public void setHasBorder(String hasBorder) {
        this.hasBorder = hasBorder;
    }

    /**
     * 
     * @return
     *     The title
     */
    public Title__ getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(Title__ title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The caption
     */
    public Caption getCaption() {
        return caption;
    }

    /**
     * 
     * @param caption
     *     The caption
     */
    public void setCaption(Caption caption) {
        this.caption = caption;
    }

    /**
     * 
     * @return
     *     The link
     */
    public Link__ getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(Link__ link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The producer
     */
    public Producer getProducer() {
        return producer;
    }

    /**
     * 
     * @param producer
     *     The producer
     */
    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    /**
     * 
     * @return
     *     The provider
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * 
     * @param provider
     *     The provider
     */
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    /**
     * 
     * @return
     *     The copyright
     */
    public Copyright getCopyright() {
        return copyright;
    }

    /**
     * 
     * @param copyright
     *     The copyright
     */
    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    /**
     * 
     * @return
     *     The enlargement
     */
    public Enlargement getEnlargement() {
        return enlargement;
    }

    /**
     * 
     * @param enlargement
     *     The enlargement
     */
    public void setEnlargement(Enlargement enlargement) {
        this.enlargement = enlargement;
    }

    /**
     * 
     * @return
     *     The crop
     */
    public List<Crop> getCrop() {
        return crop;
    }

    /**
     * 
     * @param crop
     *     The crop
     */
    public void setCrop(List<Crop> crop) {
        this.crop = crop;
    }

}
