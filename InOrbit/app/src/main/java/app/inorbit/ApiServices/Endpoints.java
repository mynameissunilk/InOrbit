package app.inorbit.ApiServices;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
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

    private static String TAG = "NETWORK";

    // LaunchLibrary (for Rocket Launch Information)
    private static final String launchLibURL = "https://launchlibrary.net/1.1/";

    // ISS location API
    private static final String issURL = "https://api.wheretheiss.at/v1/satellites/";

    // Nasa Astronomy Picture of the Day
    private static final String nasaAPODBaseURL = "https://api.nasa.gov/planetary/";
    private static final String nasaAPODKey = "IsXUyhCSGkUP5QHrAAYITkO2PyqGeawPISAwZXRr";

    // Token for NASA's Socrata APIs (Extra-Vehicular Activity, Meteor Information, Near-Earth-Object Tracker
    private static final String nasaDataToken = "Z8MdAeCnERprY22J6Bgv0UnLN";

    // NASA Near Earth Object Tracker (meteors, etc)
    private static final String nasaNearEarthObjBaseURL = "https://api.nasa.gov/neo/rest/v1/feed/";

    // NASA: Meteorite Landings
    // https://data.nasa.gov/resource/y77d-th95.json?$where=mass>1000000
    public static final String nasaMeteorBaseUrl = "https://data.nasa.gov/resource/";

    // NASA Extra-vehicular Activity(EVA) - US and Russia
    public static final String nasaEVABaseURL = "https://data.nasa.gov/resource/";
    // query endpoint is: "$where=eva>356"



    // NPR
    public static final String nprURL = "http://api.npr.org/";
    public static final String nprKey = "MDI1OTA2MzQxMDE0NzEzODI2NTU4NjNkMA000";

    // The Guardian
    private static final String guardianURL = "http://content.guardianapis.com/";
    private static final String guardianKey = "84a85242-3b93-42f2-8952-138f45f50dee";

    // The New York Times
    private static final String nytBaseURL = "https://api.nytimes.com/svc/search/v2/";
    private static final String nytKey ="4a3efda1da0840c5929ff4e7758f0b59";
    //"73f5f97cf52247a7a83b9f24299a23e2";

    // Twitter

    // Flickr


    // pass same client to each API Call
    public static OkHttpClient createClient(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor) // the logging interceptor
                .build();
        return client;
    }
                      /** >>>>>[API CALLS BELOW]<<<<< **/
                      // TODO: implement callbacks with POJO (so minor... these calls work which is what matters! )
    public static void connectNYT(OkHttpClient client){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(nytBaseURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NytAPIService nytService = retrofit.create(NytAPIService.class);

        String filterQuery = "document_type:article AND (news_desk:Science OR section_name:Science)";

        // "headline,lead_paragraph,pub_date,web_url,multimedia"
        String filterFields ="headline,lead_paragraph,pub_date,web_url,multimedia";

        Call<ResponseBody> nytCall = nytService.getNYTArticles(
                 "NASA",
                 filterQuery,
                 filterFields,
                 nytKey
         );
         nytCall.enqueue(new Callback<ResponseBody>() {
             @Override
             public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                 if (response.isSuccessful()) {
                     Log.i(TAG+"NYT","CONNECTED");
                     // TODO: Log response.body() in terms of Java Model Objects
                 }

             }

             @Override
             public void onFailure(Call<ResponseBody> call, Throwable t) {
                 Log.i(">>>>>NYT","CONNECTION FAILED");
             }
         });
    }

    public static void connectAPOD(OkHttpClient client) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(nasaAPODBaseURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NasaAPODService nasaService = retrofit.create(NasaAPODService.class);

        Call<ContentAPOD> call = nasaService.getAPOD(nasaAPODKey);

        call.enqueue(new Callback<ContentAPOD>() {
            @Override
            public void onResponse(Call<ContentAPOD> call, Response<ContentAPOD> response) {

                String apodTitle = response.body().getTitle();
                // String apodexplanation = response.body().getExplanation();
                // String apodUrl = response.body().getUrl();

                Log.i(TAG,apodTitle);


                //return new APOD(apodTitle,apodexplanation,apodUrl);

            }

            @Override
            public void onFailure(Call<ContentAPOD> call, Throwable t) {

            }
        });
    }

    public static void connectGuardian(OkHttpClient client){
// "http://content.guardianapis.com/search?section=science&order-by=newest&q=NASA&api-key=84a85242-3b93-42f2-8952-138f45f50dee"
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(guardianURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GuardianAPIService guardianService = retrofit.create(GuardianAPIService.class);
        Call<ResponseBody> guardianCall = guardianService.getGuardianArticles(
                "science",
                "newest",
                "NASA",
                guardianKey
        );
        guardianCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.isSuccessful()){
                    Log.i(TAG+">>>>>GUARDIAN","CONNECTED ");
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }

    public static void connectLaunchLibrary(OkHttpClient client){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(launchLibURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        LaunchLibraryService launchService = retrofit.create(LaunchLibraryService.class);
        Call<ResponseBody> launchCall = launchService.getLaunchDates();
        launchCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.isSuccessful()){
                    Log.i(TAG+"LAUNCHLIBRARY", "CONNECTION SUCCESSFUL");

                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }

    public static void connectISSLocation(OkHttpClient client){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(issURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IssLocationService IssService = retrofit.create(IssLocationService.class);
        Call<ResponseBody> issCall = IssService.getISSLocation();
        issCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.isSuccessful()){
                    Log.i(TAG+"ISS LOCATION","SUCCESS<<<<<");
                    Log.i("OUTPUT: ",response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });

    }

    public static void connectNeoService(OkHttpClient client){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(nasaNearEarthObjBaseURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NasaNEOService nasaService = retrofit.create(NasaNEOService.class);
        Call<ResponseBody> nasaCall = nasaService.getNearEarthObjects(
                nasaDataToken,
                "true",
                nasaAPODKey
        );

        nasaCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.i(TAG+"NASA","SUCCESS");
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }

    public static void connectMeteorData(OkHttpClient client){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(nasaMeteorBaseUrl)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        NasaSocrataService meteorService = retrofit.create(NasaSocrataService.class);
        Call<ResponseBody>meteorCall = meteorService.getMeteorData(nasaDataToken);
        meteorCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.isSuccessful())
                    Log.i(TAG+"METEORS","SUCCESS");
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }

    public static void connectExtraVehicularActivity(OkHttpClient client){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(nasaEVABaseURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        NasaSocrataService evaService = retrofit.create(NasaSocrataService.class);
        Call<ResponseBody>evaCall = evaService.getEVAInfo(nasaDataToken);
        evaCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.isSuccessful())
                    Log.i(TAG+"EVA","SUCCESSFUL !!! ");
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }

}
