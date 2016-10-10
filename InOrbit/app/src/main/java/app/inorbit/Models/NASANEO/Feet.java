
package app.inorbit.Models.NASANEO;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Feet {

    @SerializedName("estimated_diameter_min")
    @Expose
    private Double estimatedDiameterMin;
    @SerializedName("estimated_diameter_max")
    @Expose
    private Double estimatedDiameterMax;

    /**
     * 
     * @return
     *     The estimatedDiameterMin
     */
    public Double getEstimatedDiameterMin() {
        return estimatedDiameterMin;
    }

    /**
     * 
     * @param estimatedDiameterMin
     *     The estimated_diameter_min
     */
    public void setEstimatedDiameterMin(Double estimatedDiameterMin) {
        this.estimatedDiameterMin = estimatedDiameterMin;
    }

    /**
     * 
     * @return
     *     The estimatedDiameterMax
     */
    public Double getEstimatedDiameterMax() {
        return estimatedDiameterMax;
    }

    /**
     * 
     * @param estimatedDiameterMax
     *     The estimated_diameter_max
     */
    public void setEstimatedDiameterMax(Double estimatedDiameterMax) {
        this.estimatedDiameterMax = estimatedDiameterMax;
    }

}
