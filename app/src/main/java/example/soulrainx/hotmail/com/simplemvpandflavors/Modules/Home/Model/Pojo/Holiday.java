package example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.Pojo;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by irvingonzalez on 1/26/18.
 */

public class Holiday {

    String name;
    Date date;
    Date observed;
    @SerializedName("public")
    Boolean isPublic;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getObserved() {
        return observed;
    }

    public void setObserved(Date observed) {
        this.observed = observed;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }
}
