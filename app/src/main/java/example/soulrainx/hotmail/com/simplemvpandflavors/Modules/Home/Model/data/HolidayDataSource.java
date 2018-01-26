package example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.data;

import java.util.List;

import example.soulrainx.hotmail.com.simplemvpandflavors.Common.Request;
import example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.Pojo.Holiday;

/**
 * Created by irvingonzalez on 1/26/18.
 */

public interface HolidayDataSource {

    // Remote Interface
    interface LoadHolidaysCallback {
        void onLoadedHolidays(List<Holiday> holidays);

        void onNoData();
    }

    void getHolidays(LoadHolidaysCallback callback, Request request);
}
