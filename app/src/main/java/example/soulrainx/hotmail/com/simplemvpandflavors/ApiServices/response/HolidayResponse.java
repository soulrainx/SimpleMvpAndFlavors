package example.soulrainx.hotmail.com.simplemvpandflavors.ApiServices.response;

import android.support.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.Pojo.Holiday;

/**
 * Created by irvingonzalez on 1/26/18.
 */

public class HolidayResponse {

    @Nullable
    public List<Holiday> getHolidays() {
        return holidays;
    }

    @Nullable
    @SerializedName("holidays")
    @Expose
    private List<Holiday> holidays = null;
}
