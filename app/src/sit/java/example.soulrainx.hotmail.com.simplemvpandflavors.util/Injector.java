package example.soulrainx.hotmail.com.simplemvpandflavors.util;

import example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.data.DAO.HolidayDAO;
import example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.data.HolidayDataSource;

/**
 * Created by irvingonzalez on 1/26/18.
 */

public class Injector {

    public static HolidayDataSource getDataSource(){
        return HolidayDAO.getInstance();
    }
}
