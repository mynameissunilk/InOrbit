
package app.inorbit.Models.NASANEO;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ContentNASANEO {

    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("element_count")
    @Expose
    private Integer elementCount;
    @SerializedName("near_earth_objects")
    @Expose
    private NearEarthObjects nearEarthObjects;

    /**
     * 
     * @return
     *     The links
     */
    public Links getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(Links links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The elementCount
     */
    public Integer getElementCount() {
        return elementCount;
    }

    /**
     * 
     * @param elementCount
     *     The element_count
     */
    public void setElementCount(Integer elementCount) {
        this.elementCount = elementCount;
    }

    /**
     * 
     * @return
     *     The nearEarthObjects
     */
    public NearEarthObjects getNearEarthObjects() {
        return nearEarthObjects;
    }

    /**
     * 
     * @param nearEarthObjects
     *     The near_earth_objects
     */
    public void setNearEarthObjects(NearEarthObjects nearEarthObjects) {
        this.nearEarthObjects = nearEarthObjects;
    }

}
