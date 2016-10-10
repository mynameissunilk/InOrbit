
package app.inorbit.Models.NASANEO;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class RelativeVelocity {

    @SerializedName("kilometers_per_second")
    @Expose
    private String kilometersPerSecond;
    @SerializedName("kilometers_per_hour")
    @Expose
    private String kilometersPerHour;
    @SerializedName("miles_per_hour")
    @Expose
    private String milesPerHour;

    /**
     * 
     * @return
     *     The kilometersPerSecond
     */
    public String getKilometersPerSecond() {
        return kilometersPerSecond;
    }

    /**
     * 
     * @param kilometersPerSecond
     *     The kilometers_per_second
     */
    public void setKilometersPerSecond(String kilometersPerSecond) {
        this.kilometersPerSecond = kilometersPerSecond;
    }

    /**
     * 
     * @return
     *     The kilometersPerHour
     */
    public String getKilometersPerHour() {
        return kilometersPerHour;
    }

    /**
     * 
     * @param kilometersPerHour
     *     The kilometers_per_hour
     */
    public void setKilometersPerHour(String kilometersPerHour) {
        this.kilometersPerHour = kilometersPerHour;
    }

    /**
     * 
     * @return
     *     The milesPerHour
     */
    public String getMilesPerHour() {
        return milesPerHour;
    }

    /**
     * 
     * @param milesPerHour
     *     The miles_per_hour
     */
    public void setMilesPerHour(String milesPerHour) {
        this.milesPerHour = milesPerHour;
    }

}
