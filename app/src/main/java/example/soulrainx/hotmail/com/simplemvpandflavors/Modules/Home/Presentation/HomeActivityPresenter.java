package example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Presentation;

import java.util.List;

import example.soulrainx.hotmail.com.simplemvpandflavors.Common.HolidayRequest;
import example.soulrainx.hotmail.com.simplemvpandflavors.Common.Request;
import example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.Pojo.Holiday;
import example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.data.HolidayDataSource;

/**
 * Created by irvingonzalez on 1/26/18.
 */

public class HomeActivityPresenter implements HomeContract.Presenter {

    HomeContract.View view;
    HolidayDataSource holidayDataSource;

    public HomeActivityPresenter(HomeContract.View view, HolidayDataSource holidayDataSource) {
        this.view = view;
        this.holidayDataSource = holidayDataSource;
    }

    @Override
    public void loadHolidays(String country, String month, String year) {
        view.showProgress(true);

        Request request = new HolidayRequest(country, month, year);

        holidayDataSource.getHolidays(new HolidayDataSource.LoadHolidaysCallback() {
            @Override
            public void onLoadedHolidays(List<Holiday> holidays) {
                view.displayHolidays(holidays);
                view.showProgress(false);
            }

            @Override
            public void onNoData() {
                view.showMessage("No Data Response not succesful");
                view.showProgress(false);
            }
        }, request);
    }
}
