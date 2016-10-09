
package app.inorbit.Models.LaunchLibrary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Launch {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("windowstart")
    @Expose
    private String windowstart;
    @SerializedName("windowend")
    @Expose
    private String windowend;
    @SerializedName("net")
    @Expose
    private String net;
    @SerializedName("wsstamp")
    @Expose
    private Integer wsstamp;
    @SerializedName("westamp")
    @Expose
    private Integer westamp;
    @SerializedName("netstamp")
    @Expose
    private Integer netstamp;
    @SerializedName("isostart")
    @Expose
    private String isostart;
    @SerializedName("isoend")
    @Expose
    private String isoend;
    @SerializedName("isonet")
    @Expose
    private String isonet;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("inhold")
    @Expose
    private Integer inhold;
    @SerializedName("vidURL")
    @Expose
    private String vidURL;
    @SerializedName("tbdtime")
    @Expose
    private Integer tbdtime;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("rocket")
    @Expose
    private Rocket rocket;
    @SerializedName("missions")
    @Expose
    private List<Mission> missions = new ArrayList<Mission>();

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
     *     The windowstart
     */
    public String getWindowstart() {
        return windowstart;
    }

    /**
     * 
     * @param windowstart
     *     The windowstart
     */
    public void setWindowstart(String windowstart) {
        this.windowstart = windowstart;
    }

    /**
     * 
     * @return
     *     The windowend
     */
    public String getWindowend() {
        return windowend;
    }

    /**
     * 
     * @param windowend
     *     The windowend
     */
    public void setWindowend(String windowend) {
        this.windowend = windowend;
    }

    /**
     * 
     * @return
     *     The net
     */
    public String getNet() {
        return net;
    }

    /**
     * 
     * @param net
     *     The net
     */
    public void setNet(String net) {
        this.net = net;
    }

    /**
     * 
     * @return
     *     The wsstamp
     */
    public Integer getWsstamp() {
        return wsstamp;
    }

    /**
     * 
     * @param wsstamp
     *     The wsstamp
     */
    public void setWsstamp(Integer wsstamp) {
        this.wsstamp = wsstamp;
    }

    /**
     * 
     * @return
     *     The westamp
     */
    public Integer getWestamp() {
        return westamp;
    }

    /**
     * 
     * @param westamp
     *     The westamp
     */
    public void setWestamp(Integer westamp) {
        this.westamp = westamp;
    }

    /**
     * 
     * @return
     *     The netstamp
     */
    public Integer getNetstamp() {
        return netstamp;
    }

    /**
     * 
     * @param netstamp
     *     The netstamp
     */
    public void setNetstamp(Integer netstamp) {
        this.netstamp = netstamp;
    }

    /**
     * 
     * @return
     *     The isostart
     */
    public String getIsostart() {
        return isostart;
    }

    /**
     * 
     * @param isostart
     *     The isostart
     */
    public void setIsostart(String isostart) {
        this.isostart = isostart;
    }

    /**
     * 
     * @return
     *     The isoend
     */
    public String getIsoend() {
        return isoend;
    }

    /**
     * 
     * @param isoend
     *     The isoend
     */
    public void setIsoend(String isoend) {
        this.isoend = isoend;
    }

    /**
     * 
     * @return
     *     The isonet
     */
    public String getIsonet() {
        return isonet;
    }

    /**
     * 
     * @param isonet
     *     The isonet
     */
    public void setIsonet(String isonet) {
        this.isonet = isonet;
    }

    /**
     * 
     * @return
     *     The status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The inhold
     */
    public Integer getInhold() {
        return inhold;
    }

    /**
     * 
     * @param inhold
     *     The inhold
     */
    public void setInhold(Integer inhold) {
        this.inhold = inhold;
    }

    /**
     * 
     * @return
     *     The vidURL
     */
    public String getVidURL() {
        return vidURL;
    }

    /**
     * 
     * @param vidURL
     *     The vidURL
     */
    public void setVidURL(String vidURL) {
        this.vidURL = vidURL;
    }

    /**
     * 
     * @return
     *     The tbdtime
     */
    public Integer getTbdtime() {
        return tbdtime;
    }

    /**
     * 
     * @param tbdtime
     *     The tbdtime
     */
    public void setTbdtime(Integer tbdtime) {
        this.tbdtime = tbdtime;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The rocket
     */
    public Rocket getRocket() {
        return rocket;
    }

    /**
     * 
     * @param rocket
     *     The rocket
     */
    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    /**
     * 
     * @return
     *     The missions
     */
    public List<Mission> getMissions() {
        return missions;
    }

    /**
     * 
     * @param missions
     *     The missions
     */
    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

}
