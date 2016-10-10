
package app.inorbit.Models.NASANEO;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class _20161009 {

    @SerializedName("links")
    @Expose
    private Links_ links;
    @SerializedName("neo_reference_id")
    @Expose
    private String neoReferenceId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("nasa_jpl_url")
    @Expose
    private String nasaJplUrl;
    @SerializedName("absolute_magnitude_h")
    @Expose
    private Double absoluteMagnitudeH;
    @SerializedName("estimated_diameter")
    @Expose
    private EstimatedDiameter estimatedDiameter;
    @SerializedName("is_potentially_hazardous_asteroid")
    @Expose
    private Boolean isPotentiallyHazardousAsteroid;
    @SerializedName("close_approach_data")
    @Expose
    private List<CloseApproachDatum> closeApproachData = new ArrayList<CloseApproachDatum>();
    @SerializedName("orbital_data")
    @Expose
    private OrbitalData orbitalData;

    /**
     * 
     * @return
     *     The links
     */
    public Links_ getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(Links_ links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The neoReferenceId
     */
    public String getNeoReferenceId() {
        return neoReferenceId;
    }

    /**
     * 
     * @param neoReferenceId
     *     The neo_reference_id
     */
    public void setNeoReferenceId(String neoReferenceId) {
        this.neoReferenceId = neoReferenceId;
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
     *     The nasaJplUrl
     */
    public String getNasaJplUrl() {
        return nasaJplUrl;
    }

    /**
     * 
     * @param nasaJplUrl
     *     The nasa_jpl_url
     */
    public void setNasaJplUrl(String nasaJplUrl) {
        this.nasaJplUrl = nasaJplUrl;
    }

    /**
     * 
     * @return
     *     The absoluteMagnitudeH
     */
    public Double getAbsoluteMagnitudeH() {
        return absoluteMagnitudeH;
    }

    /**
     * 
     * @param absoluteMagnitudeH
     *     The absolute_magnitude_h
     */
    public void setAbsoluteMagnitudeH(Double absoluteMagnitudeH) {
        this.absoluteMagnitudeH = absoluteMagnitudeH;
    }

    /**
     * 
     * @return
     *     The estimatedDiameter
     */
    public EstimatedDiameter getEstimatedDiameter() {
        return estimatedDiameter;
    }

    /**
     * 
     * @param estimatedDiameter
     *     The estimated_diameter
     */
    public void setEstimatedDiameter(EstimatedDiameter estimatedDiameter) {
        this.estimatedDiameter = estimatedDiameter;
    }

    /**
     * 
     * @return
     *     The isPotentiallyHazardousAsteroid
     */
    public Boolean getIsPotentiallyHazardousAsteroid() {
        return isPotentiallyHazardousAsteroid;
    }

    /**
     * 
     * @param isPotentiallyHazardousAsteroid
     *     The is_potentially_hazardous_asteroid
     */
    public void setIsPotentiallyHazardousAsteroid(Boolean isPotentiallyHazardousAsteroid) {
        this.isPotentiallyHazardousAsteroid = isPotentiallyHazardousAsteroid;
    }

    /**
     * 
     * @return
     *     The closeApproachData
     */
    public List<CloseApproachDatum> getCloseApproachData() {
        return closeApproachData;
    }

    /**
     * 
     * @param closeApproachData
     *     The close_approach_data
     */
    public void setCloseApproachData(List<CloseApproachDatum> closeApproachData) {
        this.closeApproachData = closeApproachData;
    }

    /**
     * 
     * @return
     *     The orbitalData
     */
    public OrbitalData getOrbitalData() {
        return orbitalData;
    }

    /**
     * 
     * @param orbitalData
     *     The orbital_data
     */
    public void setOrbitalData(OrbitalData orbitalData) {
        this.orbitalData = orbitalData;
    }

}
