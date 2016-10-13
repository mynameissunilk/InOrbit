package app.inorbit;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.github.scribejava.apis.FlickrApi;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth1RequestToken;
import com.github.scribejava.core.oauth.OAuth10aService;

import java.io.IOException;

import java.io.UnsupportedEncodingException;

import app.inorbit.ApiServices.Endpoints;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class MainActivity extends AppCompatActivity {

    private static final String flickrKey = "ab85ab5194463ca32b34588c6bb881cc";
    private static final String flickrSecretKey = "f7cf4b2166d68879";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create a Client & Interceptor, pass it to api call methods in Endpoints
        OkHttpClient client = Endpoints.createClient();

        Endpoints.connectTwitter(client);
//            Endpoints.connectNYT(client);

        /*        THE FOLLOWING ENDPOINTS WORK:
        APOD, NYT, Guardian, LaunchLibrary, Where is the ISS       */

//        Endpoints.connectFlickr(client);


    }


    private class getFlickrToken extends AsyncTask<Void,Void,Void>{

        @Override
        protected Void doInBackground(Void... params) {

            final OAuth10aService service = new ServiceBuilder()
                    .apiKey(flickrKey)
                    .apiSecret(flickrSecretKey)
                    //.callback("www.github.com")
                    .build(FlickrApi.instance());

            try {
                final OAuth1RequestToken requestToken = service.getRequestToken();
                Log.i(">>>>> TOKEN",requestToken.toString());
                final String authorizationURL = service.getAuthorizationUrl(service.getRequestToken());
                Log.i(">>>>> AUTHORIZATION: ", authorizationURL);



            } catch (IOException e) {
                e.printStackTrace();
            }


            return null;
        }
    }
}
