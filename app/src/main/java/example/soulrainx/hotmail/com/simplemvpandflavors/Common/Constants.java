package example.soulrainx.hotmail.com.simplemvpandflavors.Common;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.Pojo.Country;
import example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.Pojo.Month;

/**
 * Created by irvingonzalez on 1/26/18.
 */

public class Constants {

    public static final List COUNTRIES = Collections.unmodifiableList(
            Arrays.asList(new Country[] {
                    new Country("AR","Argentina"),
                    new Country("AO","Angola"),
                    new Country("AT","Austria"),
                    new Country("AU","Australia"),
                    new Country("AW","Aruba"),
                    new Country("AX","Åland Islands"),
                    new Country("BA","Bosnia and Herzegovina"),
                    new Country("BE","Belgium"),
                    new Country("BG","Bulgaria"),
                    new Country("BO","Bolivia"),
                    new Country("BR","Brazil"),
                    new Country("BS","The Bahamas"),
                    new Country("CA","Canada"),
                    new Country("CH","Switzerland"),
                    new Country("CN","China"),
                    new Country("CO","Colombia"),
                    new Country("CR","Costa Rica"),
                    new Country("CU","Cuba"),
                    new Country("CZ","Czech Republic"),
                    new Country("DE","Germany"),
                    new Country("DK","Denmark"),
                    new Country("DO","Dominican Republic"),
                    new Country("EC","Ecuador"),
                    new Country("ES","Spain"),
                    new Country("FI","Finland"),
                    new Country("FR","France"),
                    new Country("GB","United Kingdom"),
                    new Country("GB-ENG","England"),
                    new Country("GB-NIR","Northern Ireland"),
                    new Country("GB-SCT","Scotland"),
                    new Country("GB-WLS","Wales"),
                    new Country("GR","Greece"),
                    new Country("GT","Guatemala"),
                    new Country("HK","Hong Kong "),
                    new Country("HN","Honduras"),
                    new Country("HR","Croatia"),
                    new Country("HU","Hungary"),
                    new Country("ID","Indonesia"),
                    new Country("IE","Ireland"),
                    new Country("IN","India"),
                    new Country("IL","Israel"),
                    new Country("IS","Iceland"),
                    new Country("IT","Italy"),
                    new Country("JP","Japan"),
                    new Country("KZ","Kazakhstan"),
                    new Country("LS","Lesotho"),
                    new Country("LU","Luxembourg"),
                    new Country("MG","Madagascar"),
                    new Country("MQ","Martinique"),
                    new Country("MT","Malta"),
                    new Country("MU","Mauritius"),
                    new Country("MX","Mexico"),
                    new Country("MZ","Mozambique"),
                    new Country("NG","Nigeria"),
                    new Country("NL","Netherlands"),
                    new Country("NO","Norway"),
                    new Country("PE","Peru"),
                    new Country("PK","Pakistan"),
                    new Country("PH","Philippines"),
                    new Country("PL","Poland"),
                    new Country("PR","Puerto Rico"),
                    new Country("PT","Portugal"),
                    new Country("PY","Paraguay"),
                    new Country("RE","Réunion"),
                    new Country("RO","Romania"),
                    new Country("RU","Russia"),
                    new Country("SC","Seychelles"),
                    new Country("SE","Sweden"),
                    new Country("SG","Singapore"),
                    new Country("SI","Slovenia"),
                    new Country("ST","Sao Tome and Principe"),
                    new Country("SK","Slovakia"),
                    new Country("TN","Tunisia"),
                    new Country("TR","Turkey"),
                    new Country("UA","Ukraine"),
                    new Country("US","United States"),
                    new Country("UY","Uruguay"),
                    new Country("VE","Venezuela"),
                    new Country("ZA","South Africa"),
                    new Country("ZW","Zimbabwe")}));


    public static final List MONTHS = Collections.unmodifiableList(
            Arrays.asList(new Month[] {
                    new Month("January","1"),
                    new Month("February","2"),
                    new Month("March","3"),
                    new Month("April","4"),
                    new Month("May","5"),
                    new Month("June","6"),
                    new Month("July","7"),
                    new Month("August","8"),
                    new Month("September","9"),
                    new Month("October","10"),
                    new Month("November","11"),
                    new Month("December","12")
            }));


}
