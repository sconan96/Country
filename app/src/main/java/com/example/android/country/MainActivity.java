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

    int koreapopulation = 50617045;
    int koreaarea = 100210;
    String koreacapital = "Seoul";
    double koreagdp = 1.31;


    public void showKorea(View view) {
        CheckBox krPopulationCheckBox = (CheckBox) findViewById(R.id.krpopulation_checkbox);
        boolean krpopulation = krPopulationCheckBox.isChecked();
        Log.v("MainActivity", "Population: " + krpopulation);

        CheckBox krAreaCheckBox = (CheckBox) findViewById(R.id.krarea_checkbox);
        boolean krarea = krAreaCheckBox.isChecked();
        Log.v("MainActivity", "Area: " + krarea);

        CheckBox krCapitalCheckBox = (CheckBox) findViewById(R.id.krcapital_checkbox);
        boolean krcapital = krCapitalCheckBox.isChecked();
        Log.v("MainActivity", "Capital: " + krcapital);

        CheckBox krGdpCheckBox = (CheckBox) findViewById(R.id.krgdp_checkbox);
        boolean krgdp = krGdpCheckBox.isChecked();
        Log.v("MainActivity", "GDP: " + krgdp);

        String krdataMessage = krinformation(krpopulation, krarea, krcapital, krgdp);
        displayMessage(krdataMessage);

    }

    private String krinformation(boolean krbp, boolean krba, boolean krbc, boolean krbg) {
        String krdataMessage = "Information";
        if(krbp)
            krdataMessage += "\nPopulation: " + koreapopulation;
        if(krba)
            krdataMessage += "\nArea(km2): " + koreaarea;
        if(krbc)
            krdataMessage += "\nCapital City: " + koreacapital;
        if(krbg)
            krdataMessage += "\nGDP(trillion$): " + koreagdp;
        return krdataMessage;
    }

    private void displayMessage(String message) {
        TextView KoreaTextView = (TextView) findViewById(R.id.krinfo);
        KoreaTextView.setText(message);
    }

}