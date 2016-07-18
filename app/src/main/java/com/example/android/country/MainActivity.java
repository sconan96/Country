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
    String koreafood = "Kimchi";

    int chinapopulation = 1382323332;
    int chinaarea = 9640821;
    String chinacapital = "Beijing";
    double chinagdp = 9.24;
    String chinafood = "huǒguō";


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

        CheckBox krFoodCheckBox = (CheckBox) findViewById(R.id.krfood_checkbox);
        boolean krfood = krFoodCheckBox.isChecked();
        Log.v("MainActivity", "Food: " + krfood);

        CheckBox krGdpCheckBox = (CheckBox) findViewById(R.id.krgdp_checkbox);
        boolean krgdp = krGdpCheckBox.isChecked();
        Log.v("MainActivity", "GDP: " + krgdp);

        String krdataMessage = krinformation(krpopulation, krarea, krcapital, krfood, krgdp);
        displayMessage01(krdataMessage);

    }

    private String krinformation(boolean krbp, boolean krba, boolean krbc, boolean krbf, boolean krbg) {
        String krdataMessage = "Information";
        if(krbp)
            krdataMessage += "\nPopulation:  " + koreapopulation;
        if(krba)
            krdataMessage += "\nArea(km2):  " + koreaarea;
        if(krbc)
            krdataMessage += "\nCapital City:  " + koreacapital;
        if(krbf)
            krdataMessage += "\nFood:  " + koreafood;
        if(krbg)
            krdataMessage += "\nGDP(Trillion$):  " + koreagdp;
        return krdataMessage;
    }

    private void displayMessage01(String message) {
        TextView KoreaTextView = (TextView) findViewById(R.id.krinfo);
        KoreaTextView.setText(message);
    }

    public void showChina(View view) {
        CheckBox chPopulationCheckBox = (CheckBox) findViewById(R.id.chpopulation_checkbox);
        boolean chpopulation = chPopulationCheckBox.isChecked();
        Log.v("MainActivity", "Population: " + chpopulation);

        CheckBox chAreaCheckBox = (CheckBox) findViewById(R.id.charea_checkbox);
        boolean charea = chAreaCheckBox.isChecked();
        Log.v("MainActivity", "Area: " + charea);

        CheckBox chCapitalCheckBox = (CheckBox) findViewById(R.id.chcapital_checkbox);
        boolean chcapital = chCapitalCheckBox.isChecked();
        Log.v("MainActivity", "Capital: " + chcapital);

        CheckBox chFoodCheckBox = (CheckBox) findViewById(R.id.chfood_checkbox);
        boolean chfood = chFoodCheckBox.isChecked();
        Log.v("MainActivity", "Food: " + chfood);

        CheckBox chGdpCheckBox = (CheckBox) findViewById(R.id.chgdp_checkbox);
        boolean chgdp = chGdpCheckBox.isChecked();
        Log.v("MainActivity", "GDP: " + chgdp);

        String chdataMessage = chinformation(chpopulation, charea, chcapital, chfood, chgdp);
        displayMessage02(chdataMessage);

    }

    private String chinformation(boolean chbp, boolean chba, boolean chbc, boolean chbf, boolean chbg) {
        String krdataMessage = "Information";
        if(chbp)
            krdataMessage += "\nPopulation:  " + chinapopulation;
        if(chba)
            krdataMessage += "\nArea(km2):  " + chinaarea;
        if(chbc)
            krdataMessage += "\nCapital City:  " + chinacapital;
        if(chbf)
            krdataMessage += "\nFood:  " + chinafood;
        if(chbg)
            krdataMessage += "\nGDP(Trillion$):  " + chinagdp;
        return krdataMessage;
    }

    private void displayMessage02(String message) {
        TextView ChinaTextView = (TextView) findViewById(R.id.chinfo);
        ChinaTextView.setText(message);
    }

}