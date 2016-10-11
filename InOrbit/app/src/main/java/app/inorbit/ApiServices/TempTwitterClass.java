/*
package app.inorbit.ApiServices;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.util.Base64;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.login.LoginException;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TempTwitterClass {
    //it was just too much of a mess to put in the Endpoints class.... until i can sort it out and clean it up



*/
/**/


/**   i will come back to this.... just leave it for now   **/


/*
/

    private static final String TAG = "TempTwitterClass";


    private static final String twitterConsumerKey = "AuUt4iH82LU1EYhfTfaxlIpWR";
    private static final String twitterConsumerSecret = "YSKdNHcy5n731hDrIreTpKMNWOrtgHJbgIpdS0USuxxm29Zj7m";
    public static final String twitterBaseURL = "https://api.twitter.com/";
    public static final String twitterRequestTokenEndpoint = "https://api.twitter.com/oauth/request_token";
    public static String twitterRequestToken = null;
    public static String twitterRequestTokenSecret = null;
    public static String twitterAccessToken = null;
    public static String twitterAccessTokenSecret = null;
    public static String twitterOauthVerifier = null;

    //putting this up here to see if it solves the problem of how to put the signature in the param string
    public static String signatureBaseString;
    public static TwitterAPIService twitterService;
    public static String authorizationHeader;
    public static String oauthSignature;


    public static void connectTwitter(OkHttpClient client, final Context context) throws UnsupportedEncodingException {
        //gather ye parameters
        String uuidString = UUID.randomUUID().toString().replaceAll("-", "");

        String oauthCallback = encode("http://localhost");
        String oauthConsumerKey = twitterConsumerKey;
        String oauthNonce = uuidString;
        String oauthSignatureMethod = "HMAC-SHA1";
        String oauthTimestamp = String.valueOf(System.currentTimeMillis());
        String oauthVersion = "1.0a";


        //TODO figure out how you can use the signiture in the paramaterstring if the parameter string is necessary to generate the signature... ?

        //for the first call to get request token, we don't have a signature yet so it's not in this auth header
        String parameterString =
                "Oauth oauth_callback=" + oauthCallback +
                        "&oauth_consumer_key=" + oauthConsumerKey +
                        "&oauth_nonce=" + oauthNonce +
                        "&oauth_signature=" +oauthSignature +
                        "&oauth_signature_method=" + oauthSignatureMethod +
                        "&oauth_timestamp=" + oauthTimestamp +
                        "&oauth_version=" + oauthVersion;

        signatureBaseString = "POST&" + encode(twitterRequestTokenEndpoint) + "&" + encode(parameterString);

        oauthSignature = generateTwitterSignature(signatureBaseString, twitterConsumerSecret + "&", twitterAccessTokenSecret);// note the & at the end. Normally the user access_token would go here, but we don't know it yet for request_token
        Log.i(TAG, "OAUTH SIGNATURE: " + oauthSignature);

        authorizationHeader =
                "Oauth oauth_callback=" + oauthCallback +
                        "&oauth_consumer_key=" + oauthConsumerKey +
                        "&oauth_nonce=" + oauthNonce +
                        "&oauth_signature=" + generateTwitterSignature(signatureBaseString, twitterConsumerSecret + "&", twitterAccessTokenSecret) +//inluding accesstokensecret because if it is null, my method accounts for that
                        "&oauth_signature_method=" + oauthSignatureMethod +
                        "&oauth_timestamp=" + oauthTimestamp +
                        "&oauth_version=" + oauthVersion;


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(twitterBaseURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        twitterService = retrofit.create(TwitterAPIService.class);


        */
/** >>>>OBTAIN REQUEST_TOKEN<<<< **//*

        Call<ResponseBody> requestTokenCall = twitterService.obtainRequestToken(authorizationHeader);
        requestTokenCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.i(TAG + "TWITTER", "REQUEST TOKEN CALL SUCCESS");

                try {
                    JSONObject object = new JSONObject(response.body().string());
                    boolean callbackConfirmed = object.getBoolean("oauth_callback_confirmed");
                    if (callbackConfirmed) {
                        //verify it's good, store other values
                        twitterRequestToken = object.getString("oauth_token");
                        twitterRequestTokenSecret = object.getString("oauth_token_secret");
                        Log.i(TAG, "TWITTER REQUEST TOKEN = "+ twitterRequestToken);



                        //now that we have the oauth token and secret,
                        */
/**>>>>REDIRECT USER TO SIGN IN<<<<**//*

                        String authUrl = "https://api.twitter.com/oauth/authenticate?oauth_token=" + twitterRequestToken;
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(authUrl));
                        context.startActivity(intent);

                        */
/** >>>>AUTHENTICATE USER, GET OAUTH_VERIFIER<<<< **//*

                        authenticateUser(twitterRequestToken);

                    }
                } catch (JSONException | IOException e) {
                    e.printStackTrace();
                }

                // if auth is successful, my callback_url receives a request containing oauth_token and oauth_verifier
                //TODO how can i intercept the server's response to nab the oauth_verifier?
                //then we gotta verify that that token matches the one that i received above, store both values for converting to access token
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG + "TWITTER", "REQUEST TOKEN CALL FAILED onFailure: " + t.getMessage());
            }
        });






    }

    public static void authenticateUser(final String requestToken){
        Call<ResponseBody> authenticationCall = twitterService.authenticateUser(authorizationHeader,requestToken);
        authenticationCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    JSONObject object = new JSONObject(response.body().string());
                    Log.i(TAG, "AUTHENTICATEUSER: OAUTH TOKEN = "+ object.getString("oauth_token"));
                    Log.i(TAG, "AUTHENTICATEUSER: request tkn = "+requestToken);
                    if(requestToken.equals(object.getString("oauth_token"))){
                        twitterOauthVerifier = object.getString("oauth_verifier");
                        Log.i(TAG, "AUTHENTICATEUSER: OAUTH VERIFIER = "+twitterOauthVerifier);

                        */
/**>>>>CONVERT REQUEST_TOKEN TO ACCESS_TOKEN<<<<**//*

                        convertToken(twitterOauthVerifier);
                    }

                } catch (JSONException | IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG + "TWITTER", "AUTHENTICATEUSER CALL FAILED onFailure: " + t.getMessage());

            }
        });

    }

    public static void convertToken(String oauthVerifier){
        Call<ResponseBody> getAccessToken = twitterService.convertToAccessToken(authorizationHeader, twitterOauthVerifier);
        Log.i(TAG, "TWITTER OAUTH VERIFIER = " + twitterOauthVerifier);
        getAccessToken.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.i(TAG + "TWITTER", "ACCESS TOKEN CALL SUCCESS");

                try {
                    JSONObject object = new JSONObject(response.body().string());

                    twitterAccessToken = object.getString("oauth_token");
                    twitterAccessTokenSecret = object.getString("oauth_token_secret");
                    // we store these values and can use them to do like GET account/verify_credentials if we ever should need to

                } catch (JSONException | IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG + "TWITTER", "ACCESS TOKEN CALL FAILED onFailure: " + t.getMessage());

            }
        });

    }





    public static String generateTwitterSignature(String signatureBaseStr, String oauthConsumerSecret, String oauthTokenSecret) {
        byte[] byteHMAC = null;
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            SecretKeySpec spec;
            if (oauthTokenSecret == null) {
                String signingKey = encode(oauthConsumerSecret) + "&";
                spec = new SecretKeySpec(signingKey.getBytes(), "HmacSHA1");
            } else {
                String signingKey = encode(oauthConsumerSecret) + "&" + encode(oauthTokenSecret);
                spec = new SecretKeySpec(signingKey.getBytes(), "HmacSHA1");
            }

            mac.init(spec);
            byteHMAC = mac.doFinal(signatureBaseStr.getBytes());

        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }

        String signature = Base64.encodeToString(byteHMAC, Base64.NO_WRAP);
        return signature;
    }


    @NonNull
    private static String encode(String value) {
        String encoded = "";
        try {
            encoded = URLEncoder.encode(value, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        String sb = "";
        char focus;
        for (int i = 0; i < encoded.length(); i++) {
            focus = encoded.charAt(i);
            if (focus == '*') {
                sb += "%2A";
            } else if (focus == '+') {
                sb += "%20";
            } else if (focus == '%' && i + 1 < encoded.length()
                    && encoded.charAt(i + 1) == '7' && encoded.charAt(i + 2) == 'E') {
                sb += '~';
                i += 2;
            } else {
                sb += focus;
            }
        }
        return sb.toString();
    }


}
*/
