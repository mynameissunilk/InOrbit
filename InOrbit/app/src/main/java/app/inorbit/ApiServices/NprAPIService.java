package app.inorbit.ApiServices;


import app.inorbit.Models.NPR.ContentNPR;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by owlslubic on 10/6/16.
 */

public interface NprAPIService {


    @GET("query")
    Call<ContentNPR> getArticle(
            @Query("id") int id,
            @Query("fields") String fields,
            @Query("output") String output,
            @Query("numResults") int numResults,
            @Query("apiKey") String apikey);

    // http://api.npr.org/
    // query?id=1026
    // &fields=title,storyDate,text,image
    // &output=JSON&numResults=10
    // &apiKey=MDI1OTA2MzQxMDE0NzEzODI2NTU4NjNkMA000
}
