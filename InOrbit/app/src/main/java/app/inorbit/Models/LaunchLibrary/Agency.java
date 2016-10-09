
package app.inorbit.Models.LaunchLibrary;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Agency {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("abbrev")
    @Expose
    private String abbrev;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("infoURL")
    @Expose
    private String infoURL;
    @SerializedName("wikiURL")
    @Expose
    private String wikiURL;

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
     *     The abbrev
     */
    public String getAbbrev() {
        return abbrev;
    }

    /**
     * 
     * @param abbrev
     *     The abbrev
     */
    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
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

    /**
     * 
     * @return
     *     The type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(Integer type) {
        this.type = type;
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

}
