package app.inorbit.ApiServices;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import app.inorbit.Models.APOD.ContentAPOD;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by owlslubic on 10/6/16.
 */

public class Endpoints {

    // LaunchLibrary (for Rocket Launch Information)
    public static final String launchLibURL = "https://launchlibrary.net/1.1/";

    // ISS location API
    public static final String issURL = "https://api.wheretheiss.at/v1/satellites/";

    // Nasa Astronomy Picture of the Day
    public static final String nasaAPODBaseURL = "https://api.nasa.gov/planetary/";
    public static final String nasaAPODKey = "IsXUyhCSGkUP5QHrAAYITkO2PyqGeawPISAwZXRr";

    // NASA Near Earth Object Tracker (meteors, etc)
    // full endpoint for getting Today's nearby objects: https://api.nasa.gov/neo/rest/v1/feed/today?detailed=true&api_key=KEY
    public static final String nasaNearEarthObjBaseURL = "https://api.nasa.gov/neo/rest/v1/today/";
    // TODO: get NASA app api key for the many nasa requests that we will make (not a big deal, but can't forget to do that either, now can we?
    // NASA: Meteorite Landings
    // below url gets meteor "landings" whose masses are over 1million grams, we can showcase the largest meteors on earth recorded by man (so far)
    // https://data.nasa.gov/resource/y77d-th95.json?$where=mass>1000000
    public static final String nasaMeteorBaseUrl = "https://data.nasa.gov/resource/y77d-th95.json/";

    // NASA Extra-vehicular Activity(EVA) - US and Russia
    public static final String nasaEVABaseURL = "https://data.nasa.gov/resource/q8u9-7uq7.json/";
    // query endpoint is: "$where=eva>356" sigh, pass as query param or append to query? i'll figure it out later



    // NPR
    public static final String nprURL = "http://api.npr.org/";
    public static final String nprKey = "MDI1OTA2MzQxMDE0NzEzODI2NTU4NjNkMA000";

    // The Guardian
    public static final String guardianURL = "http://content.guardianapis.com/";
    public static final String guardianKey = "84a85242-3b93-42f2-8952-138f45f50dee";

    // The New York Times
    public static final String nytURL = "https://api.nytimes.com/svc/search/v2/";
    public static final String nytKey ="4a3efda1da0840c5929ff4e7758f0b59";
    //"73f5f97cf52247a7a83b9f24299a23e2";

    // Twitter

    // Flickr

    //etc.

    // create one client, pass it to each request (save a few lines of code for each request method
    public static OkHttpClient createClient(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor) // the logging interceptor
                .build();
        return client;
    }

    // API Call/Endpoint Methods
    public static void connectAPOD(OkHttpClient client) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(nasaAPODBaseURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NasaApiService nasaService = retrofit.create(NasaApiService.class);

        Call<ContentAPOD> call = nasaService.getAPOD(nasaAPODKey);

        call.enqueue(new Callback<ContentAPOD>() {
            @Override
            public void onResponse(Call<ContentAPOD> call, Response<ContentAPOD> response) {

                String apodTitle = response.body().getTitle();
                String apodexplanation = response.body().getExplanation();
                String apodUrl = response.body().getUrl();

                  Log.i("APOD: ",apodTitle);


                //return new APOD(apodTitle,apodexplanation,apodUrl);

            }

            @Override
            public void onFailure(Call<ContentAPOD> call, Throwable t) {

            }
        });
    }




}
