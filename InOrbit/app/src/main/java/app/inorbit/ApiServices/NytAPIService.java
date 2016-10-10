package app.inorbit.ApiServices;

import java.util.List;

import app.inorbit.Models.NYT.ContentNYT;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by sunil on 10/8/16.
 */

public interface NytAPIService {
    @GET("articlesearch.json")
    Call<ContentNYT> getNYTArticles(
            @Query("q") String query,
            @Query("fq") String filterQuery,
            @Query("fl") String filterFields,
            @Query("api-key") String key
    );
}
