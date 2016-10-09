
package app.inorbit.Models.NASANEO;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class EstimatedDiameter {

    @SerializedName("kilometers")
    @Expose
    private Kilometers kilometers;
    @SerializedName("meters")
    @Expose
    private Meters meters;
    @SerializedName("miles")
    @Expose
    private Miles miles;
    @SerializedName("feet")
    @Expose
    private Feet feet;

    /**
     * 
     * @return
     *     The kilometers
     */
    public Kilometers getKilometers() {
        return kilometers;
    }

    /**
     * 
     * @param kilometers
     *     The kilometers
     */
    public void setKilometers(Kilometers kilometers) {
        this.kilometers = kilometers;
    }

    /**
     * 
     * @return
     *     The meters
     */
    public Meters getMeters() {
        return meters;
    }

    /**
     * 
     * @param meters
     *     The meters
     */
    public void setMeters(Meters meters) {
        this.meters = meters;
    }

    /**
     * 
     * @return
     *     The miles
     */
    public Miles getMiles() {
        return miles;
    }

    /**
     * 
     * @param miles
     *     The miles
     */
    public void setMiles(Miles miles) {
        this.miles = miles;
    }

    /**
     * 
     * @return
     *     The feet
     */
    public Feet getFeet() {
        return feet;
    }

    /**
     * 
     * @param feet
     *     The feet
     */
    public void setFeet(Feet feet) {
        this.feet = feet;
    }

}
