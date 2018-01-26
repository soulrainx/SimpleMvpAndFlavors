package example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.Pojo;

/**
 * Created by irvingonzalez on 1/26/18.
 */

public class Country {

    private String isoCode;
    private String name;

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country(String isoCode, String name) {
        this.isoCode = isoCode;
        this.name = name;
    }

    //to display object as a string in spinner
    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Country) {
            Country c = (Country) obj;
            if (c.getName().equals(name) && c.getIsoCode() == isoCode) return true;
        }

        return false;
    }
}
