package example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Presentation;

import java.util.List;

import example.soulrainx.hotmail.com.simplemvpandflavors.Common.Request;
import example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.Pojo.Holiday;

/**
 * Created by irvingonzalez on 1/26/18.
 */

public interface HomeContract {

    //Actions the view perform triggered by Presenter
    interface View {
        void showProgress(boolean show);
        void showMessage(String message);
        void displayHolidays(List<Holiday> holidays);
    }

    //Actions the presenter perfomr triggered by View
    interface Presenter {
        void loadHolidays(String country, String month, String year);
    }
}
