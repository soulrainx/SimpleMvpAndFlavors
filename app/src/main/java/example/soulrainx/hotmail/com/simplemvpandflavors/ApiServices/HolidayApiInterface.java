package example.soulrainx.hotmail.com.simplemvpandflavors.ApiServices;

import android.support.annotation.NonNull;

import example.soulrainx.hotmail.com.simplemvpandflavors.ApiServices.response.HolidayResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by irvingonzalez on 1/26/18.
 */

public interface HolidayApiInterface {

    String BASE_URL = "https://holidayapi.com/";

    // Request method and URL specified in the annotation
    @NonNull
    @GET("v1/holidays")
    Call<HolidayResponse> getHolidays(@Query("key") String key,
                                     @Query("country") String country,
                                     @Query("year") String year,
                                     @Query("month") String month);

}
