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

        OkHttpClient client = Endpoints.createClient();

        Endpoints.connectAPOD(client);


    }
}
//6782245