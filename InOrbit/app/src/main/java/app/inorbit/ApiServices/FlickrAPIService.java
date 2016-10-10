package app.inorbit.ApiServices;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by sunil on 10/9/16.
 */

public interface FlickrAPIService {

    @GET("rest")
    Call<ResponseBody> getImages(
            @Query("method") String method, // flickr.people.getPhotos
            @Query("api-key") String key,
            @Query("user-id") String id,
            @Query("content_type") int contentCode,
            @Query("per_page") int numPerPage,
            @Query("format") String format // JSON
    );
}
