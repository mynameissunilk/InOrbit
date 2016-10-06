package owlslubic.inorbit.ApiServices;

import owlslubic.inorbit.Models.NPR.ContentNpr;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by owlslubic on 10/6/16.
 */

public interface NprService {


    @GET("query?fields=title,storyDate,text&id=1026&num=110&type=topic&output=JSON&numResults=10")
    Call<ContentNpr> getArticle(
            @Query("apiKey") String apikey);


}
