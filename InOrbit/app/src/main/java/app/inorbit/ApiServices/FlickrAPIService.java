package app.inorbit.ApiServices;

import app.inorbit.Models.Flickr.ContentFlickr;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by sunil on 10/9/16.
 */

public interface FlickrAPIService {

    @GET("oauth/request_token")
    Call<ResponseBody> getRequestToken(
            @Query("oauth_consumer_key") String consumerKey,
            @Query("signature_method") String method
    );

    @GET("rest")
    Call<ContentFlickr> getImages(
            @Query("method") String method, // flickr.people.getPhotos
            @Query("api_key") String key,
            @Query("user_id") String id,
            @Query("per_page") int numPerPage,
            @Query("format") String format,
            @Query("nojsoncallback") int nocallback// JSON
    );
}
