package app.inorbit.ApiServices;

import app.inorbit.Models.APOD.ContentAPOD;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface NasaApiService {
    @GET("/planetary/apod")
    Call<ContentAPOD> getAPOD(@Query("api_key") String key);
}
