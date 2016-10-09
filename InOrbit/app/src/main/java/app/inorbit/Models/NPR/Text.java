
package app.inorbit.Models.NPR;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Text {

    @SerializedName("paragraph")
    @Expose
    private List<Paragraph> paragraph = new ArrayList<Paragraph>();

    /**
     * 
     * @return
     *     The paragraph
     */
    public List<Paragraph> getParagraph() {
        return paragraph;
    }

    /**
     * 
     * @param paragraph
     *     The paragraph
     */
    public void setParagraph(List<Paragraph> paragraph) {
        this.paragraph = paragraph;
    }

}
