
package app.inorbit.Models.NASANEO;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class MissDistance {

    @SerializedName("astronomical")
    @Expose
    private String astronomical;
    @SerializedName("lunar")
    @Expose
    private String lunar;
    @SerializedName("kilometers")
    @Expose
    private String kilometers;
    @SerializedName("miles")
    @Expose
    private String miles;

    /**
     * 
     * @return
     *     The astronomical
     */
    public String getAstronomical() {
        return astronomical;
    }

    /**
     * 
     * @param astronomical
     *     The astronomical
     */
    public void setAstronomical(String astronomical) {
        this.astronomical = astronomical;
    }

    /**
     * 
     * @return
     *     The lunar
     */
    public String getLunar() {
        return lunar;
    }

    /**
     * 
     * @param lunar
     *     The lunar
     */
    public void setLunar(String lunar) {
        this.lunar = lunar;
    }

    /**
     * 
     * @return
     *     The kilometers
     */
    public String getKilometers() {
        return kilometers;
    }

    /**
     * 
     * @param kilometers
     *     The kilometers
     */
    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    /**
     * 
     * @return
     *     The miles
     */
    public String getMiles() {
        return miles;
    }

    /**
     * 
     * @param miles
     *     The miles
     */
    public void setMiles(String miles) {
        this.miles = miles;
    }

}
