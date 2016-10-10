
package app.inorbit.Models.LaunchLibrary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Rocket {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("configuration")
    @Expose
    private String configuration;
    @SerializedName("familyname")
    @Expose
    private String familyname;
    @SerializedName("agencies")
    @Expose
    private List<Agency_> agencies = new ArrayList<Agency_>();

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
     *     The configuration
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * 
     * @param configuration
     *     The configuration
     */
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * 
     * @return
     *     The familyname
     */
    public String getFamilyname() {
        return familyname;
    }

    /**
     * 
     * @param familyname
     *     The familyname
     */
    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    /**
     * 
     * @return
     *     The agencies
     */
    public List<Agency_> getAgencies() {
        return agencies;
    }

    /**
     * 
     * @param agencies
     *     The agencies
     */
    public void setAgencies(List<Agency_> agencies) {
        this.agencies = agencies;
    }

}
