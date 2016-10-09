
package app.inorbit.Models.NPR;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Enlargement {

    @SerializedName("src")
    @Expose
    private String src;
    @SerializedName("caption")
    @Expose
    private Caption_ caption;

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
     *     The caption
     */
    public Caption_ getCaption() {
        return caption;
    }

    /**
     * 
     * @param caption
     *     The caption
     */
    public void setCaption(Caption_ caption) {
        this.caption = caption;
    }

}
