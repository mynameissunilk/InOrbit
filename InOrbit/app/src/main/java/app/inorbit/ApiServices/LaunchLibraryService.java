package app.inorbit.ApiServices;

import app.inorbit.Models.LaunchLibrary.ContentLaunchLibrary;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sunil on 10/6/16.
 */
    // this gets the next 5 launch dates, we can change this
    //TODO: annotate endpoints with @PATH, change hardcoded string to default 5 but make it overridable
public interface LaunchLibraryService {
    @GET("launch/next/5")
    Call<ContentLaunchLibrary>getLaunchDates();
}
