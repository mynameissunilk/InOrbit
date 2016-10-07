
package App.inorbit.Models.NPR;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class StoryDate {

    @SerializedName("$text")
    @Expose
    private String $text;

    /**
     * 
     * @return
     *     The $text
     */
    public String get$text() {
        return $text;
    }

    /**
     * 
     * @param $text
     *     The $text
     */
    public void set$text(String $text) {
        this.$text = $text;
    }

}
