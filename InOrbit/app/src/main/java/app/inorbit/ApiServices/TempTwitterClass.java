package app.inorbit.ApiServices;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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

import app.inorbit.MainActivity;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TempTwitterClass {
    //it was just too much of a mess in the Endpoints class....

    private static final String TAG = "TempTwitterClass";


    private static final String twitterConsumerKey = "AuUt4iH82LU1EYhfTfaxlIpWR";
    private static final String twitterConsumerSecret = "YSKdNHcy5n731hDrIreTpKMNWOrtgHJbgIpdS0USuxxm29Zj7m";
    public static final String twitterBaseURL = "https://api.twitter.com/";
    public static final String twitterRequestTokenEndpoint = "https://api.twitter.com/oauth/request_token";
    public static String twitterRequestToken = "";
    public static String twitterRequestTokenSecret = "";
    public static String twitterAccessToken = "";
    public static String twitterAccessTokenSecret = "";
    public static String twitterOauthVerifier = "";


    public static void connectTwitter(OkHttpClient client, final Context context) throws UnsupportedEncodingException {
        //gather ye parameters
        String uuidString = UUID.randomUUID().toString().replaceAll("-", "");
        String oauthCallback = percentEncode("http://localhost");
        String oauthConsumerKey = twitterConsumerKey;
        String oauthNonce = uuidString;
        String oauthSignatureMethod = "HMAC-SHA1";
        String oauthTimestamp = String.valueOf(System.currentTimeMillis());
        String oauthVersion = "1.0a";


        //TODO figure out how you can use the signiture in the paramaterstring if the parameter string is necessary to generate the signature... ?
        String parameterString =
                "Oauth oauth_callback=" + oauthCallback +
                        "&oauth_consumer_key=" + oauthConsumerKey +
                        "&oauth_nonce=" + oauthNonce +
//                        "&oauth_signature=" + generateTwitterSignature(signatureBaseString,twitterConsumerSecret+"&")+
                        "&oauth_signature_method=" + oauthSignatureMethod +
                        "&oauth_timestamp=" + oauthTimestamp +
                        "&oauth_version=" + oauthVersion;


        String signatureBaseString = "POST&" + percentEncode(twitterRequestTokenEndpoint) + "&" + percentEncode(parameterString);
        String oauthSignature = generateTwitterSignature(signatureBaseString, twitterConsumerSecret + "&", null);// note the & at the end. Normally the user access_token would go here, but we don't know it yet for request_token
        Log.i(TAG, "OAUTH SIGNATURE: " + oauthSignature);


        /** first up is getting the request_token **/
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(twitterBaseURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TwitterAPIService twitterService = retrofit.create(TwitterAPIService.class);

        Call<ResponseBody> requestTokenCall = twitterService.requestToken(oauthSignature);
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


                        //now that we have the oauth token and secret,
                        // we redirect the user to sign in via WebView to:
                        String authUrl = "https://api.twitter.com/oauth/authenticate?oauth_token=" + twitterRequestToken;
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(authUrl));
                        context.startActivity(intent);

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


        /** convert request_token to access_token **/
        Call<ResponseBody> getAccessToken = twitterService.convertToAccessToken(parameterString, twitterOauthVerifier);
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
                String signingKey = percentEncode(oauthConsumerSecret) + "&";
                spec = new SecretKeySpec(signingKey.getBytes(), "HmacSHA1");
            } else {
                String signingKey = percentEncode(oauthConsumerSecret) + "&" + percentEncode(oauthTokenSecret);
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


    private static String percentEncode(String value) {
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
