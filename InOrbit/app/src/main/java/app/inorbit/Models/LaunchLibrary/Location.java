
package app.inorbit.Models.LaunchLibrary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Location {

    @SerializedName("pads")
    @Expose
    private List<Pad> pads = new ArrayList<Pad>();
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("infoURL")
    @Expose
    private String infoURL;
    @SerializedName("wikiURL")
    @Expose
    private String wikiURL;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;

    /**
     * 
     * @return
     *     The pads
     */
    public List<Pad> getPads() {
        return pads;
    }

    /**
     * 
     * @param pads
     *     The pads
     */
    public void setPads(List<Pad> pads) {
        this.pads = pads;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The infoURL
     */
    public String getInfoURL() {
        return infoURL;
    }

    /**
     * 
     * @param infoURL
     *     The infoURL
     */
    public void setInfoURL(String infoURL) {
        this.infoURL = infoURL;
    }

    /**
     * 
     * @return
     *     The wikiURL
     */
    public String getWikiURL() {
        return wikiURL;
    }

    /**
     * 
     * @param wikiURL
     *     The wikiURL
     */
    public void setWikiURL(String wikiURL) {
        this.wikiURL = wikiURL;
    }

    /**
     * 
     * @return
     *     The countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 
     * @param countryCode
     *     The countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

}
