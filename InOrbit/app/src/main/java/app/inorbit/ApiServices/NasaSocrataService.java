package app.inorbit.ApiServices;

import app.inorbit.Models.NASAExtraVehic.ContentNASAEVA;
import app.inorbit.Models.NASAMeteor.ContentNASAMeteor;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by sunil on 10/8/16.
 */

public interface NasaSocrataService {
    @GET("y77d-th95.json?$where=mass>1000000")
    Call<ContentNASAMeteor> getMeteorData(
            @Header("X-App-Token") String token

    );

    @GET("q8u9-7uq7.json?$where=eva>355")
    Call<ContentNASAEVA> getEVAInfo(
            @Header("X-App-Token") String token
    );
}
