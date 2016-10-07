
package App.inorbit.Models.NPR;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContentNpr {

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
