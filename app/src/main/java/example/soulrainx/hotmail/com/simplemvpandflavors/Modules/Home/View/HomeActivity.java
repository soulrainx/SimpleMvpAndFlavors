package example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import example.soulrainx.hotmail.com.simplemvpandflavors.Common.Constants;
import example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.Pojo.Country;
import example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.Pojo.Holiday;
import example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Model.Pojo.Month;
import example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Presentation.HomeActivityPresenter;
import example.soulrainx.hotmail.com.simplemvpandflavors.Modules.Home.Presentation.HomeContract;
import example.soulrainx.hotmail.com.simplemvpandflavors.R;
import example.soulrainx.hotmail.com.simplemvpandflavors.util.Injector;


public class HomeActivity extends AppCompatActivity implements HomeContract.View {


    Spinner countrySpinner;
    Spinner yearSpinner;
    Spinner monthSpinner;
    ProgressBar progressBar;

    LinearLayout holidayContainer;

    Button searchButton;

    HomeActivityPresenter presenter;

    String country;
    String month;
    String year;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity_layout);

        holidayContainer = (LinearLayout) findViewById(R.id.home_txt_holidays);
        countrySpinner = (Spinner) findViewById(R.id.home_txt_spinner_country);
        monthSpinner = (Spinner) findViewById(R.id.home_txt_spinner_month);
        yearSpinner = (Spinner) findViewById(R.id.home_txt_spinner_year);
        searchButton = (Button) findViewById(R.id.home_txt_searchBtn);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        // Set up the toolbar.
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initSpinners();

        presenter = new HomeActivityPresenter(this, Injector.getDataSource());
    }

    private void initSpinners() {
        //fill data in spinner
        ArrayAdapter<Country> cadapter = new ArrayAdapter<Country>(this, android.R.layout.simple_spinner_dropdown_item, Constants.COUNTRIES);
        countrySpinner.setAdapter(cadapter);
        countrySpinner.setSelection(0);//Optional to set the selected item.

        ArrayAdapter<Month> mAdapter = new ArrayAdapter<Month>(this, android.R.layout.simple_spinner_dropdown_item, Constants.MONTHS);
        monthSpinner.setAdapter(mAdapter);
        monthSpinner.setSelection(0);//Optional to set the selected item.

        Integer[] items = new Integer[]{2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018};
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, items);
        yearSpinner.setAdapter(adapter);

        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                country = ((Country) parent.getSelectedItem()).getIsoCode();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        monthSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                month = ((Month) parent.getSelectedItem()).getNumber();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        yearSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                year = String.valueOf(parent.getSelectedItem());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    public void searchHolidays(View view) {
        if (!TextUtils.isEmpty(month) && !TextUtils.isEmpty(year) && !TextUtils.isEmpty(country)) {
            presenter.loadHolidays(country, month, year);
        } else {
            Toast.makeText(this, "Please select year month and country", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public void showProgress(boolean show) {
        progressBar.setVisibility(show ? View.VISIBLE : View.GONE);
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void displayHolidays(List<Holiday> holidays) {

        holidayContainer.removeAllViews();

        for (Holiday holiday : holidays) {

            View inflatedView = View.inflate(this, R.layout.holiday_view, null);

            ((TextView) inflatedView.findViewById(R.id.holiday_view_name)).setText(holiday.getName());

            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String requiredDate = df.format(holiday.getDate()).toString();

            ((TextView) inflatedView.findViewById(R.id.holiday_view_date)).setText(requiredDate);


            holidayContainer.addView(inflatedView);

        }
    }
}
