package com.example.android.country;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void krShow(View view) {
        CheckBox krPopulationCheckBox = (CheckBox) findViewById(R.id.krpopulation_checkbox);
        boolean krpopulation = krPopulationCheckBox.isChecked();
        Log.v("MainActivity", "Population: " + krpopulation);

        CheckBox krAreaCheckBox = (CheckBox) findViewById(R.id.krarea_checkbox);
        boolean krarea = krAreaCheckBox.isChecked();
        Log.v("MainActivity", "Area: " + krarea);

        CheckBox krCapitalCheckBox = (CheckBox) findViewById(R.id.krcapital_checkbox);
        boolean krcaptial = krCapitalCheckBox.isChecked();
        Log.v("MainActivity", "Capital: " + krcaptial);

        CheckBox krGdpCheckBox = (CheckBox) findViewById(R.id.krgdp_checkbox);
        boolean krgdp = krGdpCheckBox.isChecked();
        Log.v("MainActivity", "GDP: " + krgdp);


        String krdataMessage = krinfor(krpopulation, krarea, krcaptial, krgdp);
        displayMessage(krdataMessage);

    }

    private String krinfor() {
        krdataMessage += "\nPopulation: " + ;
        krdataMessage += "\nArea: " + ;
        krdataMessage += "\nCapital City " + ;
        krdataMessage += "\nGDP " + ;
        return krdataMessage;
    }

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
}