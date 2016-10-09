
package app.inorbit.Models.ISS;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ContentISS {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("altitude")
    @Expose
    private Double altitude;
    @SerializedName("velocity")
    @Expose
    private Double velocity;
    @SerializedName("visibility")
    @Expose
    private String visibility;
    @SerializedName("footprint")
    @Expose
    private Double footprint;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("daynum")
    @Expose
    private Double daynum;
    @SerializedName("solar_lat")
    @Expose
    private Double solarLat;
    @SerializedName("solar_lon")
    @Expose
    private Double solarLon;
    @SerializedName("units")
    @Expose
    private String units;

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
     *     The latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The altitude
     */
    public Double getAltitude() {
        return altitude;
    }

    /**
     * 
     * @param altitude
     *     The altitude
     */
    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    /**
     * 
     * @return
     *     The velocity
     */
    public Double getVelocity() {
        return velocity;
    }

    /**
     * 
     * @param velocity
     *     The velocity
     */
    public void setVelocity(Double velocity) {
        this.velocity = velocity;
    }

    /**
     * 
     * @return
     *     The visibility
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * 
     * @param visibility
     *     The visibility
     */
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * 
     * @return
     *     The footprint
     */
    public Double getFootprint() {
        return footprint;
    }

    /**
     * 
     * @param footprint
     *     The footprint
     */
    public void setFootprint(Double footprint) {
        this.footprint = footprint;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     * @return
     *     The daynum
     */
    public Double getDaynum() {
        return daynum;
    }

    /**
     * 
     * @param daynum
     *     The daynum
     */
    public void setDaynum(Double daynum) {
        this.daynum = daynum;
    }

    /**
     * 
     * @return
     *     The solarLat
     */
    public Double getSolarLat() {
        return solarLat;
    }

    /**
     * 
     * @param solarLat
     *     The solar_lat
     */
    public void setSolarLat(Double solarLat) {
        this.solarLat = solarLat;
    }

    /**
     * 
     * @return
     *     The solarLon
     */
    public Double getSolarLon() {
        return solarLon;
    }

    /**
     * 
     * @param solarLon
     *     The solar_lon
     */
    public void setSolarLon(Double solarLon) {
        this.solarLon = solarLon;
    }

    /**
     * 
     * @return
     *     The units
     */
    public String getUnits() {
        return units;
    }

    /**
     * 
     * @param units
     *     The units
     */
    public void setUnits(String units) {
        this.units = units;
    }

}
