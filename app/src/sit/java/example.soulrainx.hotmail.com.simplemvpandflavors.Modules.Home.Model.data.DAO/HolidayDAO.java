package example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.data.DAO;

import android.support.annotation.NonNull;
import android.util.Log;

import example.soulrainx.hotmail.com.simplemvpandflavors.ApiServices.HolidayApiInterface;
import example.soulrainx.hotmail.com.simplemvpandflavors.ApiServices.response.HolidayResponse;
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

    //Singleton
    public static HolidayDAO getInstance() {
        if (INSTANCE == null)
            INSTANCE = new HolidayDAO();

        return INSTANCE;
    }

    // Prevent direct instantiation
    private HolidayDAO() {
        // CONTENT PROVIDER
    }


    @Override
    public void getHolidays(@NonNull final LoadHolidaysCallback callback) {

    }
}
