package app.inorbit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.inorbit.ApiServices.Endpoints;
import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create a Client & Interceptor, pass it to api call methods in Endpoints
        OkHttpClient client = Endpoints.createClient();

        /*
        THE FOLLOWING ENDPOINTS WORK:
        APOD, NYT, Guardian
        */

    }
}
