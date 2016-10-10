
package app.inorbit.Models.NASAExtraVehic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ContentNASAEVA {

    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("crew")
    @Expose
    private String crew;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("eva")
    @Expose
    private String eva;
    @SerializedName("purpose")
    @Expose
    private String purpose;
    @SerializedName("vehicle")
    @Expose
    private String vehicle;

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The crew
     */
    public String getCrew() {
        return crew;
    }

    /**
     * 
     * @param crew
     *     The crew
     */
    public void setCrew(String crew) {
        this.crew = crew;
    }

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The eva
     */
    public String getEva() {
        return eva;
    }

    /**
     * 
     * @param eva
     *     The eva
     */
    public void setEva(String eva) {
        this.eva = eva;
    }

    /**
     * 
     * @return
     *     The purpose
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * 
     * @param purpose
     *     The purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
     * 
     * @return
     *     The vehicle
     */
    public String getVehicle() {
        return vehicle;
    }

    /**
     * 
     * @param vehicle
     *     The vehicle
     */
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

}
