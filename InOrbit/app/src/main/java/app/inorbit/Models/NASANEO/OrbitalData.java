
package app.inorbit.Models.NASANEO;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class OrbitalData {

    @SerializedName("orbit_id")
    @Expose
    private String orbitId;
    @SerializedName("orbit_determination_date")
    @Expose
    private String orbitDeterminationDate;
    @SerializedName("orbit_uncertainty")
    @Expose
    private String orbitUncertainty;
    @SerializedName("minimum_orbit_intersection")
    @Expose
    private String minimumOrbitIntersection;
    @SerializedName("jupiter_tisserand_invariant")
    @Expose
    private String jupiterTisserandInvariant;
    @SerializedName("epoch_osculation")
    @Expose
    private String epochOsculation;
    @SerializedName("eccentricity")
    @Expose
    private String eccentricity;
    @SerializedName("semi_major_axis")
    @Expose
    private String semiMajorAxis;
    @SerializedName("inclination")
    @Expose
    private String inclination;
    @SerializedName("ascending_node_longitude")
    @Expose
    private String ascendingNodeLongitude;
    @SerializedName("orbital_period")
    @Expose
    private String orbitalPeriod;
    @SerializedName("perihelion_distance")
    @Expose
    private String perihelionDistance;
    @SerializedName("perihelion_argument")
    @Expose
    private String perihelionArgument;
    @SerializedName("aphelion_distance")
    @Expose
    private String aphelionDistance;
    @SerializedName("perihelion_time")
    @Expose
    private String perihelionTime;
    @SerializedName("mean_anomaly")
    @Expose
    private String meanAnomaly;
    @SerializedName("mean_motion")
    @Expose
    private String meanMotion;
    @SerializedName("equinox")
    @Expose
    private String equinox;

    /**
     * 
     * @return
     *     The orbitId
     */
    public String getOrbitId() {
        return orbitId;
    }

    /**
     * 
     * @param orbitId
     *     The orbit_id
     */
    public void setOrbitId(String orbitId) {
        this.orbitId = orbitId;
    }

    /**
     * 
     * @return
     *     The orbitDeterminationDate
     */
    public String getOrbitDeterminationDate() {
        return orbitDeterminationDate;
    }

    /**
     * 
     * @param orbitDeterminationDate
     *     The orbit_determination_date
     */
    public void setOrbitDeterminationDate(String orbitDeterminationDate) {
        this.orbitDeterminationDate = orbitDeterminationDate;
    }

    /**
     * 
     * @return
     *     The orbitUncertainty
     */
    public String getOrbitUncertainty() {
        return orbitUncertainty;
    }

    /**
     * 
     * @param orbitUncertainty
     *     The orbit_uncertainty
     */
    public void setOrbitUncertainty(String orbitUncertainty) {
        this.orbitUncertainty = orbitUncertainty;
    }

    /**
     * 
     * @return
     *     The minimumOrbitIntersection
     */
    public String getMinimumOrbitIntersection() {
        return minimumOrbitIntersection;
    }

    /**
     * 
     * @param minimumOrbitIntersection
     *     The minimum_orbit_intersection
     */
    public void setMinimumOrbitIntersection(String minimumOrbitIntersection) {
        this.minimumOrbitIntersection = minimumOrbitIntersection;
    }

    /**
     * 
     * @return
     *     The jupiterTisserandInvariant
     */
    public String getJupiterTisserandInvariant() {
        return jupiterTisserandInvariant;
    }

    /**
     * 
     * @param jupiterTisserandInvariant
     *     The jupiter_tisserand_invariant
     */
    public void setJupiterTisserandInvariant(String jupiterTisserandInvariant) {
        this.jupiterTisserandInvariant = jupiterTisserandInvariant;
    }

    /**
     * 
     * @return
     *     The epochOsculation
     */
    public String getEpochOsculation() {
        return epochOsculation;
    }

    /**
     * 
     * @param epochOsculation
     *     The epoch_osculation
     */
    public void setEpochOsculation(String epochOsculation) {
        this.epochOsculation = epochOsculation;
    }

    /**
     * 
     * @return
     *     The eccentricity
     */
    public String getEccentricity() {
        return eccentricity;
    }

    /**
     * 
     * @param eccentricity
     *     The eccentricity
     */
    public void setEccentricity(String eccentricity) {
        this.eccentricity = eccentricity;
    }

    /**
     * 
     * @return
     *     The semiMajorAxis
     */
    public String getSemiMajorAxis() {
        return semiMajorAxis;
    }

    /**
     * 
     * @param semiMajorAxis
     *     The semi_major_axis
     */
    public void setSemiMajorAxis(String semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    /**
     * 
     * @return
     *     The inclination
     */
    public String getInclination() {
        return inclination;
    }

    /**
     * 
     * @param inclination
     *     The inclination
     */
    public void setInclination(String inclination) {
        this.inclination = inclination;
    }

    /**
     * 
     * @return
     *     The ascendingNodeLongitude
     */
    public String getAscendingNodeLongitude() {
        return ascendingNodeLongitude;
    }

    /**
     * 
     * @param ascendingNodeLongitude
     *     The ascending_node_longitude
     */
    public void setAscendingNodeLongitude(String ascendingNodeLongitude) {
        this.ascendingNodeLongitude = ascendingNodeLongitude;
    }

    /**
     * 
     * @return
     *     The orbitalPeriod
     */
    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    /**
     * 
     * @param orbitalPeriod
     *     The orbital_period
     */
    public void setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    /**
     * 
     * @return
     *     The perihelionDistance
     */
    public String getPerihelionDistance() {
        return perihelionDistance;
    }

    /**
     * 
     * @param perihelionDistance
     *     The perihelion_distance
     */
    public void setPerihelionDistance(String perihelionDistance) {
        this.perihelionDistance = perihelionDistance;
    }

    /**
     * 
     * @return
     *     The perihelionArgument
     */
    public String getPerihelionArgument() {
        return perihelionArgument;
    }

    /**
     * 
     * @param perihelionArgument
     *     The perihelion_argument
     */
    public void setPerihelionArgument(String perihelionArgument) {
        this.perihelionArgument = perihelionArgument;
    }

    /**
     * 
     * @return
     *     The aphelionDistance
     */
    public String getAphelionDistance() {
        return aphelionDistance;
    }

    /**
     * 
     * @param aphelionDistance
     *     The aphelion_distance
     */
    public void setAphelionDistance(String aphelionDistance) {
        this.aphelionDistance = aphelionDistance;
    }

    /**
     * 
     * @return
     *     The perihelionTime
     */
    public String getPerihelionTime() {
        return perihelionTime;
    }

    /**
     * 
     * @param perihelionTime
     *     The perihelion_time
     */
    public void setPerihelionTime(String perihelionTime) {
        this.perihelionTime = perihelionTime;
    }

    /**
     * 
     * @return
     *     The meanAnomaly
     */
    public String getMeanAnomaly() {
        return meanAnomaly;
    }

    /**
     * 
     * @param meanAnomaly
     *     The mean_anomaly
     */
    public void setMeanAnomaly(String meanAnomaly) {
        this.meanAnomaly = meanAnomaly;
    }

    /**
     * 
     * @return
     *     The meanMotion
     */
    public String getMeanMotion() {
        return meanMotion;
    }

    /**
     * 
     * @param meanMotion
     *     The mean_motion
     */
    public void setMeanMotion(String meanMotion) {
        this.meanMotion = meanMotion;
    }

    /**
     * 
     * @return
     *     The equinox
     */
    public String getEquinox() {
        return equinox;
    }

    /**
     * 
     * @param equinox
     *     The equinox
     */
    public void setEquinox(String equinox) {
        this.equinox = equinox;
    }

}
