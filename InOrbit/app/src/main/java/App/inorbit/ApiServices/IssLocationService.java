package App.inorbit.ApiServices;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

/**
 * Created by sunil on 10/6/16.
 */

// TODO: pass this as a param in the future if we want to leverage more from this API, TO BE DETERMINED
public interface IssLocationService {
    @GET("25544")
    Call<ResponseBody> getISSLocation();
}
