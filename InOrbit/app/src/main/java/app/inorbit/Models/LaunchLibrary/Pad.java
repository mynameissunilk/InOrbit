
package app.inorbit.Models.LaunchLibrary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Pad {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("infoURL")
    @Expose
    private Object infoURL;
    @SerializedName("wikiURL")
    @Expose
    private String wikiURL;
    @SerializedName("mapURL")
    @Expose
    private String mapURL;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("agencies")
    @Expose
    private List<Agency> agencies = new ArrayList<Agency>();

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
    public Object getInfoURL() {
        return infoURL;
    }

    /**
     * 
     * @param infoURL
     *     The infoURL
     */
    public void setInfoURL(Object infoURL) {
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
     *     The mapURL
     */
    public String getMapURL() {
        return mapURL;
    }

    /**
     * 
     * @param mapURL
     *     The mapURL
     */
    public void setMapURL(String mapURL) {
        this.mapURL = mapURL;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The agencies
     */
    public List<Agency> getAgencies() {
        return agencies;
    }

    /**
     * 
     * @param agencies
     *     The agencies
     */
    public void setAgencies(List<Agency> agencies) {
        this.agencies = agencies;
    }

}
