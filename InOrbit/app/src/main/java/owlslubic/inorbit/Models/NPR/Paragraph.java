
package owlslubic.inorbit.Models.NPR;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Paragraph {

    @SerializedName("num")
    @Expose
    private String num;
    @SerializedName("$text")
    @Expose
    private String $text;

    /**
     * 
     * @return
     *     The num
     */
    public String getNum() {
        return num;
    }

    /**
     * 
     * @param num
     *     The num
     */
    public void setNum(String num) {
        this.num = num;
    }

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
