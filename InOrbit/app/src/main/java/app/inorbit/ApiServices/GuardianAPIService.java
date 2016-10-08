package app.inorbit.ApiServices;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by sunil on 10/8/16.
 */
// section=science&order-by=newest&q=NASA&api-key=KEY
public interface GuardianAPIService {
     @GET("search")
     Call<ResponseBody> getGuardianArticles(
             @Query("section") String sectionName,
             @Query("order-by") String sortNewest,
             @Query("q") String query,
             @Query("api-key") String key
     );
}
