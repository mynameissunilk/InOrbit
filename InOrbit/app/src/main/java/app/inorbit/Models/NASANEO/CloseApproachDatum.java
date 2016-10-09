
package app.inorbit.Models.NASANEO;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class CloseApproachDatum {

    @SerializedName("close_approach_date")
    @Expose
    private String closeApproachDate;
    @SerializedName("epoch_date_close_approach")
    @Expose
    private Integer epochDateCloseApproach;
    @SerializedName("relative_velocity")
    @Expose
    private RelativeVelocity relativeVelocity;
    @SerializedName("miss_distance")
    @Expose
    private MissDistance missDistance;
    @SerializedName("orbiting_body")
    @Expose
    private String orbitingBody;

    /**
     * 
     * @return
     *     The closeApproachDate
     */
    public String getCloseApproachDate() {
        return closeApproachDate;
    }

    /**
     * 
     * @param closeApproachDate
     *     The close_approach_date
     */
    public void setCloseApproachDate(String closeApproachDate) {
        this.closeApproachDate = closeApproachDate;
    }

    /**
     * 
     * @return
     *     The epochDateCloseApproach
     */
    public Integer getEpochDateCloseApproach() {
        return epochDateCloseApproach;
    }

    /**
     * 
     * @param epochDateCloseApproach
     *     The epoch_date_close_approach
     */
    public void setEpochDateCloseApproach(Integer epochDateCloseApproach) {
        this.epochDateCloseApproach = epochDateCloseApproach;
    }

    /**
     * 
     * @return
     *     The relativeVelocity
     */
    public RelativeVelocity getRelativeVelocity() {
        return relativeVelocity;
    }

    /**
     * 
     * @param relativeVelocity
     *     The relative_velocity
     */
    public void setRelativeVelocity(RelativeVelocity relativeVelocity) {
        this.relativeVelocity = relativeVelocity;
    }

    /**
     * 
     * @return
     *     The missDistance
     */
    public MissDistance getMissDistance() {
        return missDistance;
    }

    /**
     * 
     * @param missDistance
     *     The miss_distance
     */
    public void setMissDistance(MissDistance missDistance) {
        this.missDistance = missDistance;
    }

    /**
     * 
     * @return
     *     The orbitingBody
     */
    public String getOrbitingBody() {
        return orbitingBody;
    }

    /**
     * 
     * @param orbitingBody
     *     The orbiting_body
     */
    public void setOrbitingBody(String orbitingBody) {
        this.orbitingBody = orbitingBody;
    }

}
