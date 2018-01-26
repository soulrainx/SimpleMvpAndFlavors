package example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.data.DAO;

import android.support.annotation.NonNull;
import android.util.Log;

import example.soulrainx.hotmail.com.simplemvpandflavors.ApiServices.HolidayApiInterface;
import example.soulrainx.hotmail.com.simplemvpandflavors.ApiServices.response.HolidayResponse;
import example.soulrainx.hotmail.com.simplemvpandflavors.Common.HolidayRequest;
import example.soulrainx.hotmail.com.simplemvpandflavors.Common.Request;
import example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.data.HolidayDataSource;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static example.soulrainx.hotmail.com.simplemvpandflavors.ApiServices.HolidayApiInterface.BASE_URL;

/**
 * Created by irvingonzalez on 1/26/18.
 */

public class HolidayDAO implements HolidayDataSource {


    public static HolidayDAO INSTANCE;
    private Retrofit retrofit;

    //Singleton
    public static HolidayDAO getInstance() {
        if (INSTANCE == null)
            INSTANCE = new HolidayDAO();

        return INSTANCE;
    }

    // Prevent direct instantiation
    private HolidayDAO() {
        // Construct Retrofit
        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();

        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.networkInterceptors().add(httpLoggingInterceptor);
        OkHttpClient okHttpClient = builder.build();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL) // Base Url or Domain
                .addConverterFactory(GsonConverterFactory.create()) // Serializer
                .client(okHttpClient) // For logging
                .build();
    }


    @Override
    public void getHolidays(@NonNull final LoadHolidaysCallback callback, final Request request) {
        HolidayApiInterface apiService = retrofit.create(HolidayApiInterface.class);

        HolidayRequest request1 = (HolidayRequest) request;
        Call<HolidayResponse> call = apiService.getHolidays("d8733fe6-785b-48aa-a5c7-3c89a0c2616a", request1.getCountry(), request1.getYear(), request1.getMonth());
        call.enqueue(new Callback<HolidayResponse>() {
            @Override
            public void onResponse(Call<HolidayResponse> call, Response<HolidayResponse> response) {
                Log.d("Network", response.message());

                if(response.isSuccessful()) {
                    callback.onLoadedHolidays(response.body().getHolidays());
                } else {
                    callback.onNoData();
                }
            }

            @Override
            public void onFailure(Call<HolidayResponse> call, Throwable t) {
                Log.e("Network", t.getMessage());
                callback.onNoData();
            }
        });
    }
}
