package app.inorbit.ApiServices;

import java.util.List;

import app.inorbit.Models.Twitter.ContentTwitter;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by owlslubic on 10/9/16.
 */

public interface TwitterAPIService {


    @POST("oauth2/token")
    Call<ResponseBody> authorizeApplication(@Header("Authorization") String authorization,
                                            @Header("Content-Type") String contentType,
                                            @Query("grant_type") String grantType);

    @GET("1.1/statuses/user_timeline.json")
    Call<List<ContentTwitter>> userTimeline(@Header("Authorization") String authorization,
                                             @Query("screen_name") String screenName,
                                             @Query("count") int count);

    @GET("1.1/search/tweets.json")
    Call<ResponseBody> searchTweets(@Header("Authorization") String authorization,
                                    @Query("q") String query,
                                    @Query("lang") String language,
                                    @Query("result_type") String searchResultType,
                                    @Query("count") int count);






    /*
    these are for the sign in auth

    @POST("oauth/request_token")
    Call<ResponseBody> obtainRequestToken(@Header("Authorization") String authorizationHeader
    );

    @GET("oauth/authenticate")
    Call<ResponseBody> authenticateUser(
            @Header("Authorization") String authorizationHeader,
            @Query("oauth_token") String requestToken);


    @POST("oauth/access_token")
    Call<ResponseBody> convertToAccessToken(
            @Header("Authorization") String authorizationHeader,
            @Body("oauth_verifier") String oauthVerifier);

    */
}


