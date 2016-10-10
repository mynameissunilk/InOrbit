package app.inorbit.ApiServices;

import app.inorbit.Models.NASANEO.ContentNASANEO;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by sunil on 10/8/16.
 */

public interface NasaNEOService {

    @GET("today/")
    Call<ContentNASANEO> getNearEarthObjects(
            @Header("X-App-Token") String token,
            @Query("detailed") String detail,
            @Query("api_key") String apiKey
    );
}
