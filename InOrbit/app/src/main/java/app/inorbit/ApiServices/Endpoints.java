package app.inorbit.ApiServices;

import android.util.Base64;
import android.util.Log;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;


import java.util.List;

import app.inorbit.Models.Flickr.ContentFlickr;
import app.inorbit.Models.Guardian.ContentGuardian;
import app.inorbit.Models.ISS.ContentISS;
import app.inorbit.Models.LaunchLibrary.ContentLaunchLibrary;
import app.inorbit.Models.NASAExtraVehic.ContentNASAEVA;
import app.inorbit.Models.NASAMeteor.ContentNASAMeteor;
import app.inorbit.Models.NASANEO.ContentNASANEO;
import app.inorbit.Models.NPR.ContentNPR;
import app.inorbit.Models.NYT.ContentNYT;
import app.inorbit.Models.Twitter.ContentTwitter;
import app.inorbit.Models.Twitter.Tweet;
import app.inorbit.Models.Twitter.User;
import app.inorbit.Models.Twitter.User_;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import app.inorbit.Models.NASAAPOD.ContentAPOD;
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

    // NASA Astronomy Picture of the Day
    private static final String nasaAPODBaseURL = "https://api.nasa.gov/planetary/";
    private static final String nasaAPODKey = "IsXUyhCSGkUP5QHrAAYITkO2PyqGeawPISAwZXRr";

    // Token for NASA's Socrata APIs (Extra-Vehicular Activity, Meteor Information, Near-Earth-Object Tracker
    private static final String nasaDataToken = "Z8MdAeCnERprY22J6Bgv0UnLN";

    // NASA Near Earth Object Tracker (meteors, etc)
    private static final String nasaNearEarthObjBaseURL = "https://api.nasa.gov/neo/rest/v1/feed/";

    // NASA: Meteorite Landings
    // https://data.nasa.gov/resource/y77d-th95.json?$where=mass>1000000
    private static final String nasaMeteorBaseUrl = "https://data.nasa.gov/resource/";

    // NASA Extra-vehicular Activity(EVA) - US and Russia
    private static final String nasaEVABaseURL = "https://data.nasa.gov/resource/";
    // query endpoint is: "$where=eva>356"

    // NPR
    private static final String nprURL = "http://api.npr.org/";
    private static final String nprKey = "MDI1OTA2MzQxMDE0NzEzODI2NTU4NjNkMA000";

    // The Guardian
    private static final String guardianURL = "http://content.guardianapis.com/";
    private static final String guardianKey = "84a85242-3b93-42f2-8952-138f45f50dee";

    // The New York Times
    private static final String nytBaseURL = "https://api.nytimes.com/svc/search/v2/";
    private static final String nytKey = "4a3efda1da0840c5929ff4e7758f0b59";
    //"73f5f97cf52247a7a83b9f24299a23e2";

    // Twitter
    private static final String twitterConsumerKey = "m937fzbpM0QUk5YVBh3nWE8zy";
    private static final String twitterConsumerSecret = "9JaZzy4jOqkgH8QyYxy2VDYntl0oK3OAKbVB3NdRscRo4MtE13";
    private static final String twitterBaseURL = "https://api.twitter.com/";


    // Flickr
    private static final String flickrBaseURL = "https://api.flickr.com/services/";
    private static final String flickrKey = "ab85ab5194463ca32b34588c6bb881cc";
    private static final String flickrSecretKey = "f7cf4b2166d68879";
    //private static final String flickrAuthURL = "https://www.flickr.com/auth-72157674899282716";
    private static final String nasaMarshall = "28634332@N05";
    private static final String nasaJohnson = "29988733@N04";
    // private static final String nasaKennedy = "108488366@N07";
    // private static final String nasaCommons = "44494372@N05";


    // Pass the same client to each API Call
    public static OkHttpClient createClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();

//        interceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);


        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor) // the logging interceptor
                .build();
        return client;
    }


    /**
     * >>>>>[API CALLS BELOW]<<<<<
     **/

    public static void connectNYT(OkHttpClient client) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(nytBaseURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NytAPIService nytService = retrofit.create(NytAPIService.class);

        String filterQuery = "document_type:article AND (news_desk:Science OR section_name:Science)";

        // "headline,lead_paragraph,pub_date,web_url,multimedia"
        String filterFields = "headline,lead_paragraph,pub_date,web_url,multimedia";

        Call<ContentNYT> nytCall = nytService.getNYTArticles(
                "NASA",
                filterQuery,
                filterFields,
                nytKey
        );
        nytCall.enqueue(new Callback<ContentNYT>() {
            @Override
            public void onResponse(Call<ContentNYT> call, Response<ContentNYT> response) {

                if (response.isSuccessful()) {
                    Log.i(TAG + "NYT", "CONNECTED");
                    // TODO: Log response.body() in terms of Java Model Objects
                }

            }

            @Override
            public void onFailure(Call<ContentNYT> call, Throwable t) {
                Log.i(">>>>>NYT", "CONNECTION FAILED");
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

                Log.i(TAG, apodTitle);


                //return new APOD(apodTitle,apodexplanation,apodUrl);

            }

            @Override
            public void onFailure(Call<ContentAPOD> call, Throwable t) {

            }
        });
    }

    public static void connectGuardian(OkHttpClient client) {
// "http://content.guardianapis.com/search?section=science&order-by=newest&q=NASA&api-key=84a85242-3b93-42f2-8952-138f45f50dee"
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(guardianURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GuardianAPIService guardianService = retrofit.create(GuardianAPIService.class);
        Call<ContentGuardian> guardianCall = guardianService.getGuardianArticles(
                "science",
                "newest",
                "NASA",
                guardianKey
        );
        guardianCall.enqueue(new Callback<ContentGuardian>() {
            @Override
            public void onResponse
                    (Call<ContentGuardian> call, Response<ContentGuardian> response) {
                if (response.isSuccessful()) {
                    Log.i(TAG + ">>>>>GUARDIAN", "CONNECTED ");
                }
            }

            @Override
            public void onFailure(Call<ContentGuardian> call, Throwable t) {

            }
        });
    }


    public static void connectNPR(OkHttpClient client) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(nprURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NprAPIService nprService = retrofit.create(NprAPIService.class);
        Call<ContentNPR> nprCall = nprService.getArticle(
                1026,
                "title,storyDate,text,image",
                "JSON",
                10,
                nprKey
        );

        nprCall.enqueue(new Callback<ContentNPR>() {
            @Override
            public void onResponse(Call<ContentNPR> call, Response<ContentNPR> response) {
                if (response.isSuccessful()) {
                    Log.i(TAG + "NPR>>>>>>>", "SUCCESSFUL");
                }
            }

            @Override
            public void onFailure(Call<ContentNPR> call, Throwable t) {

            }
        });
    }

    public static void connectLaunchLibrary(OkHttpClient client) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(launchLibURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        LaunchLibraryService launchService = retrofit.create(LaunchLibraryService.class);
        Call<ContentLaunchLibrary> launchCall = launchService.getLaunchDates();
        launchCall.enqueue(new Callback<ContentLaunchLibrary>() {
            @Override
            public void onResponse
                    (Call<ContentLaunchLibrary> call, Response<ContentLaunchLibrary> response) {
                if (response.isSuccessful()) {
                    Log.i(TAG + "LAUNCHLIBRARY", "CONNECTION SUCCESSFUL");

                }
            }

            @Override
            public void onFailure(Call<ContentLaunchLibrary> call, Throwable t) {

            }
        });
    }

    public static void connectISSLocation(OkHttpClient client) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(issURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IssLocationService IssService = retrofit.create(IssLocationService.class);
        Call<ContentISS> issCall = IssService.getISSLocation();
        issCall.enqueue(new Callback<ContentISS>() {
            @Override
            public void onResponse
                    (Call<ContentISS> call, Response<ContentISS> response) {
                if (response.isSuccessful()) {
                    Log.i(TAG + "ISS LOCATION", "SUCCESS<<<<<");
                    Log.i("OUTPUT: ", response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<ContentISS> call, Throwable t) {

            }
        });

    }

    public static void connectNeoService(OkHttpClient client) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(nasaNearEarthObjBaseURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NasaNEOService nasaService = retrofit.create(NasaNEOService.class);
        Call<ContentNASANEO> nasaCall = nasaService.getNearEarthObjects(
                nasaDataToken,
                "true",
                nasaAPODKey
        );

        nasaCall.enqueue(new Callback<ContentNASANEO>() {
                             @Override
                             public void onResponse
                                     (Call<ContentNASANEO> call, Response<ContentNASANEO> response) {
                                 Log.i(TAG + "NASA", "SUCCESS");
                             }

                             @Override
                             public void onFailure
                                     (Call<ContentNASANEO> call, Throwable t) {

                             }
                         }

        );
    }

    public static void connectMeteorData(OkHttpClient client) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(nasaMeteorBaseUrl)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        NasaSocrataService meteorService = retrofit.create(NasaSocrataService.class);
        Call<ContentNASAMeteor> meteorCall = meteorService.getMeteorData(nasaDataToken);
        meteorCall.enqueue(new Callback<ContentNASAMeteor>() {
            @Override
            public void onResponse(Call<ContentNASAMeteor> call, Response<ContentNASAMeteor> response) {
                if (response.isSuccessful())
                    Log.i(TAG + "METEORS", "SUCCESS");
            }

            @Override
            public void onFailure(Call<ContentNASAMeteor> call, Throwable t) {

            }
        });
    }

    public static void connectExtraVehicularActivity(OkHttpClient client) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(nasaEVABaseURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        NasaSocrataService evaService = retrofit.create(NasaSocrataService.class);
        Call<ContentNASAEVA> evaCall = evaService.getEVAInfo(nasaDataToken);
        evaCall.enqueue(new Callback<ContentNASAEVA>() {
            @Override
            public void onResponse(Call<ContentNASAEVA> call, Response<ContentNASAEVA> response) {
                if (response.isSuccessful())
                    Log.i(TAG + "EVA", "SUCCESSFUL !!! ");

            }

            @Override
            public void onFailure(Call<ContentNASAEVA> call, Throwable t) {

            }
        });
    }


    public static void connectFlickr(OkHttpClient client) {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(flickrBaseURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        FlickrAPIService flickrService = retrofit.create(FlickrAPIService.class);

        // Get NASA Johnson's photos
        Call<ContentFlickr> johnsonPhotoCall = flickrService.getImages(
                "flickr.people.getPublicPhotos",
                flickrKey,
                nasaJohnson,
                20,
                "json",
                1
        );
        johnsonPhotoCall.enqueue(new Callback<ContentFlickr>() {
            @Override
            public void onResponse(Call<ContentFlickr> call, Response<ContentFlickr> response) {
                if (response.isSuccessful())
                    Log.i("NASA JOHNSON", ">>>>>SUCCESS");
            }

            @Override
            public void onFailure(Call<ContentFlickr> call, Throwable t) {

            }
        });

        //Get NASA Marshall's Photos
        Call<ContentFlickr> marshallPhotoCall = flickrService.getImages(
                "flickr.people.getPublicPhotos",
                flickrKey,
                nasaMarshall,
                20,
                "json",
                1
        );

        marshallPhotoCall.enqueue(new Callback<ContentFlickr>() {
            @Override
            public void onResponse(Call<ContentFlickr> call, Response<ContentFlickr> response) {
                if (response.isSuccessful())
                    Log.i("NASA MARSHALL", ">>>>>SUCCESS");

            }

            @Override
            public void onFailure(Call<ContentFlickr> call, Throwable t) {

            }
        });
    }


    public static void connectTwitter(final OkHttpClient client) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(twitterBaseURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final TwitterAPIService twitterService = retrofit.create(TwitterAPIService.class);


        //prep for obtaining bearer token
        String notEncodedString = twitterConsumerKey + ":" + twitterConsumerSecret;
        byte[] data = new byte[0];
        try {
            data = notEncodedString.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String encodedString = Base64.encodeToString(data, Base64.NO_WRAP);


        // call to obtain bearer token
        Call<ResponseBody> authorizationCall = twitterService.authorizeApplication("Basic " + encodedString, "application/x-www-form-urlencoded;charset=UTF-8", "client_credentials");
        authorizationCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {

                    Log.i(TAG + " TWITTER", "SUCCESS");
                    try {
                        final String responseString = response.body().string();
                        Log.d(TAG + " TWITTER", "Bearer Token: " + responseString);
                        JSONObject object = new JSONObject(responseString);
                        String twitterAccessToken = object.getString("access_token");
                        Log.d(TAG + " TWITTER", "Access Token: " + twitterAccessToken);


                        if (twitterAccessToken != null) {

                            //calls to space agencies for "home page"
                            //@NASA
                            Call<List<ContentTwitter>> nasaCall = twitterService.userTimeline("Bearer " + twitterAccessToken, "nasa", 3);
                            nasaCall.enqueue(new Callback<List<ContentTwitter>>() {
                                @Override
                                public void onResponse(Call<List<ContentTwitter>> call, Response<List<ContentTwitter>> response) {
                                    if (response.isSuccessful()) {
                                        Log.d(TAG + " TWITTER", "GET TIMELINE CALL SUCCESS!");

                                        for (int i = 0; i < response.body().size(); i++) {

                                            String id = null;
                                            String text = null;
                                            String date = null;
                                            String statusUrl = null;
                                            String mediaUrl = null;
                                            User user = null;
                                            User_ user_= null;

                                            if (response.body().get(i).isRetweeted()) {
                                                id = response.body().get(i).getRetweetedStatus().getIdStr();
                                                text = response.body().get(i).getRetweetedStatus().getText();
                                                date = response.body().get(i).getRetweetedStatus().getCreatedAt();
                                                if (response.body().get(i).getRetweetedStatus().getEntities().getUrls().size() > 0) {
                                                    statusUrl = response.body().get(i).getRetweetedStatus().getEntities().getUrls().get(0).getExpandedUrl();
                                                }
                                                if(response.body().get(i).getRetweetedStatus().getEntities().getMedia().size()>0){
                                                     mediaUrl = response.body().get(i).getRetweetedStatus().getEntities().getMedia().get(0).getMediaUrl();
                                                }
                                                user_ = response.body().get(i).getRetweetedStatus().getUser();

                                            } else if (!response.body().get(i).isRetweeted()) {

                                                id = response.body().get(i).getIdStr();
                                                text = response.body().get(i).getText();
                                                date = response.body().get(i).getCreatedAt();
                                                if (response.body().get(i).getEntities().getUrls().size() > 0) {
                                                    statusUrl = response.body().get(i).getEntities().getUrls().get(0).getExpandedUrl();
                                                }
                                                if(response.body().get(i).getEntities().getMedia().size()>0){
                                                    mediaUrl = response.body().get(i).getEntities().getMedia().get(0).getMediaUrl();
                                                }
                                                user = response.body().get(i).getUser();

                                            }

                                            Tweet tweet = new Tweet(id, text, date, statusUrl, mediaUrl, user, user_);
                                            //add it to whatever list from here
                                            
                                            Log.i(TAG, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>TWEET OBJECT TEXT: " + tweet.getText());
                                            Log.i(TAG, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>TWEET OBJECT MEDIAURL: " + tweet.getMediaUrl());
                                            Log.i(TAG, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>TWEET OBJECT USERNAME: " + tweet.getUser().getScreenName());

                                            if(tweet.getUser_()!=null){
                                                Log.i(TAG, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>RETWEET OBJECT USERNAME: " + tweet.getUser_().getScreenName());
                                            }




                                        }

                                    }
                                }

                                @Override
                                public void onFailure(Call<List<ContentTwitter>> call, Throwable t) {
                                    Log.d(TAG + " TWITTER", "GET TIMELINE CALL FAILED: " + t.getMessage().toString());
                                }
                            });


                            //@ESAoperations
                  /*          Call<ResponseBody> esaCall = twitterService.userTimeline("Bearer " + twitterAccessToken, "esaoperations", 3);
                            esaCall.enqueue(new Callback<ResponseBody>() {
                                @Override
                                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                                    if (response.isSuccessful()) {
                                        Log.d(TAG + " TWITTER", "GET TIMELINE CALL SUCCESS!");
                                        try {
                                            Log.d(TAG + " TWITTER", "RESPONSE: " + response.body().string());

                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }

                                @Override
                                public void onFailure(Call<ResponseBody> call, Throwable t) {
                                    Log.d(TAG + " TWITTER", "GET TIMELINE CALL FAILED: " + t.getMessage().toString());
                                }
                            });


                            //use this one on the LaunchLibrary page, perhaps?
                            //@NASA_astronauts
                            Call<ResponseBody> nasaAstronautsCall = twitterService.userTimeline("Bearer " + twitterAccessToken, "nasa_astronauts", 3);
                            nasaAstronautsCall.enqueue(new Callback<ResponseBody>() {
                                @Override
                                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                                    if (response.isSuccessful()) {
                                        Log.d(TAG + " TWITTER", "GET TIMELINE CALL SUCCESS!");
                                        try {
                                            Log.d(TAG + " TWITTER", "RESPONSE: " + response.body().string());

                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }

                                @Override
                                public void onFailure(Call<ResponseBody> call, Throwable t) {
                                    Log.d(TAG + " TWITTER", "GET TIMELINE CALL FAILED: " + t.getMessage().toString());
                                }
                            });

                            //@astro_jeff
                            Call<ResponseBody> astroJeffCall = twitterService.userTimeline("Bearer " + twitterAccessToken, "astro_jeff", 3);
                            astroJeffCall.enqueue(new Callback<ResponseBody>() {
                                @Override
                                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                                    if (response.isSuccessful()) {
                                        Log.d(TAG + " TWITTER", "GET TIMELINE CALL SUCCESS!");
                                        try {
                                            Log.d(TAG + " TWITTER", "RESPONSE: " + response.body().string());

                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }

                                @Override
                                public void onFailure(Call<ResponseBody> call, Throwable t) {
                                    Log.d(TAG + " TWITTER", "GET TIMELINE CALL FAILED: " + t.getMessage().toString());
                                }
                            });

                            //@astro_kate7
                            Call<ResponseBody> astroKateCall = twitterService.userTimeline("Bearer " + twitterAccessToken, "astro_kate7", 3);
                            astroKateCall.enqueue(new Callback<ResponseBody>() {
                                @Override
                                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                                    if (response.isSuccessful()) {
                                        Log.d(TAG + " TWITTER", "GET TIMELINE CALL SUCCESS!");
                                        try {
                                            Log.d(TAG + " TWITTER", "RESPONSE: " + response.body().string());

                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }

                                @Override
                                public void onFailure(Call<ResponseBody> call, Throwable t) {
                                    Log.d(TAG + " TWITTER", "GET TIMELINE CALL FAILED: " + t.getMessage().toString());
                                }
                            });


                            //call to search all tweets
                            /*Call<ResponseBody> searchCall = twitterService.searchTweets("Bearer " + twitterAccessToken, query, "en", "mixed", 5);//mixed refers to popular and real time results
                            searchCall.enqueue(new Callback<ResponseBody>() {
                                @Override
                                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                                    if (response.isSuccessful()) {
                                        Log.d(TAG + " TWITTER", "SEARCH TWEETS CALL SUCCEEDED!!");
                                        try {
                                            Log.d(TAG + " TWITTER", "RESPONSE BODY: " + response.body().string());
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }

                                @Override
                                public void onFailure(Call<ResponseBody> call, Throwable t) {
                                    Log.d(TAG + " TWITTER", "SEARCH TWEETS CALL FAILED: " + t.getMessage().toString());

                                }
                            });*/

                        }
                    } catch (IOException | JSONException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG + " TWITTER", "Bearer token call failed: " + t.getMessage().toString());
            }
        });


    }


}





