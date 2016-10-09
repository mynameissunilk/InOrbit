
package app.inorbit.Models.NASAMeteor;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ContentNASAMeteor {

    @SerializedName("fall")
    @Expose
    private String fall;
    @SerializedName("geolocation")
    @Expose
    private Geolocation geolocation;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("mass")
    @Expose
    private String mass;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("nametype")
    @Expose
    private String nametype;
    @SerializedName("recclass")
    @Expose
    private String recclass;
    @SerializedName("reclat")
    @Expose
    private String reclat;
    @SerializedName("reclong")
    @Expose
    private String reclong;
    @SerializedName("year")
    @Expose
    private String year;

    /**
     * 
     * @return
     *     The fall
     */
    public String getFall() {
        return fall;
    }

    /**
     * 
     * @param fall
     *     The fall
     */
    public void setFall(String fall) {
        this.fall = fall;
    }

    /**
     * 
     * @return
     *     The geolocation
     */
    public Geolocation getGeolocation() {
        return geolocation;
    }

    /**
     * 
     * @param geolocation
     *     The geolocation
     */
    public void setGeolocation(Geolocation geolocation) {
        this.geolocation = geolocation;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The mass
     */
    public String getMass() {
        return mass;
    }

    /**
     * 
     * @param mass
     *     The mass
     */
    public void setMass(String mass) {
        this.mass = mass;
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
     *     The nametype
     */
    public String getNametype() {
        return nametype;
    }

    /**
     * 
     * @param nametype
     *     The nametype
     */
    public void setNametype(String nametype) {
        this.nametype = nametype;
    }

    /**
     * 
     * @return
     *     The recclass
     */
    public String getRecclass() {
        return recclass;
    }

    /**
     * 
     * @param recclass
     *     The recclass
     */
    public void setRecclass(String recclass) {
        this.recclass = recclass;
    }

    /**
     * 
     * @return
     *     The reclat
     */
    public String getReclat() {
        return reclat;
    }

    /**
     * 
     * @param reclat
     *     The reclat
     */
    public void setReclat(String reclat) {
        this.reclat = reclat;
    }

    /**
     * 
     * @return
     *     The reclong
     */
    public String getReclong() {
        return reclong;
    }

    /**
     * 
     * @param reclong
     *     The reclong
     */
    public void setReclong(String reclong) {
        this.reclong = reclong;
    }

    /**
     * 
     * @return
     *     The year
     */
    public String getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    public void setYear(String year) {
        this.year = year;
    }

}
