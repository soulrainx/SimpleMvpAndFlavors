package example.soulrainx.hotmail.com.simplemvpandflavors.Common;

/**
 * Created by irvingonzalez on 1/26/18.
 */

public class HolidayRequest extends Request {

    String country;
    String month;
    String year;

    public HolidayRequest(String country, String month, String year) {
        this.country = country;
        this.month = month;
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
