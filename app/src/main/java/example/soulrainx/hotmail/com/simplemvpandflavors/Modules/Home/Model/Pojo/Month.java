package example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.Pojo;

/**
 * Created by irvingonzalez on 1/26/18.
 */

public class Month {

    String name;
    String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Month(String name, String number) {
        this.name = name;
        this.number = number;
    }

    //to display object as a string in spinner
    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Country) {
            Month c = (Month) obj;
            if (c.getName().equals(name) && c.getNumber() == getNumber()) return true;
        }

        return false;
    }
}
