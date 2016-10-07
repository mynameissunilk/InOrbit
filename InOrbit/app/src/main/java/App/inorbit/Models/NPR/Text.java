
package App.inorbit.Models.NPR;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


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
