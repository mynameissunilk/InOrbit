package app.inorbit.ApiServices;

import android.util.Base64;

import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by owlslubic on 10/9/16.
 */

public interface TwitterAPIService {

    @POST("oauth/request_token")
    Call<ResponseBody> requestToken(@Header("Authorization") String oauthString
    );


    @POST("oauth/access_token")
    Call<ResponseBody> convertToAccessToken(
            @Header("Authorization") String oauthString,
            @Query("oauth_verifier") String oauthVerifier);
}


