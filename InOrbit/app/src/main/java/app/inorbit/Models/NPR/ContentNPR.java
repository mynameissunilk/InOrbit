
package app.inorbit.Models.NPR;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ContentNPR {

    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("list")
    @Expose
    private List list;

    /**
     * 
     * @return
     *     The version
     */
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 
     * @return
     *     The list
     */
    public List getList() {
        return list;
    }

    /**
     * 
     * @param list
     *     The list
     */
    public void setList(List list) {
        this.list = list;
    }

}
