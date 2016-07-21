package com.example.android.country;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Button button01 = (Button) findViewById(R.id.button01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }

    double koreapopulation = 50617.1;
    double koreaarea = 100.2;
    String koreacapital = "Seoul";
    String korealanguage = "Korean";
    String koreafood = "Kimchi";
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

        CheckBox krLanguageCheckBox = (CheckBox) findViewById(R.id.krlanguage_checkbox);
        boolean krlanguage = krLanguageCheckBox.isChecked();
        Log.v("MainActivity", "Language: " + krlanguage);

        CheckBox krFoodCheckBox = (CheckBox) findViewById(R.id.krfood_checkbox);
        boolean krfood = krFoodCheckBox.isChecked();
        Log.v("MainActivity", "Food: " + krfood);

        CheckBox krGdpCheckBox = (CheckBox) findViewById(R.id.krgdp_checkbox);
        boolean krgdp = krGdpCheckBox.isChecked();
        Log.v("MainActivity", "GDP: " + krgdp);

        String krdataMessage = krinformation(krpopulation, krarea, krcapital, krlanguage, krfood, krgdp);
        displayMessage01(krdataMessage);

    }

    private String krinformation(boolean krbp, boolean krba, boolean krbc, boolean krbl, boolean krbf, boolean krbg) {
        String krdataMessage = "Information: \n\n";
        if(krbp)
            krdataMessage += "\nPopulation(Thousand):  " + koreapopulation;
        if(krba)
            krdataMessage += "\nArea(Thousand km2):  " + koreaarea;
        if(krbc)
            krdataMessage += "\nCapital City:  " + koreacapital;
        if(krbl)
            krdataMessage += "\nLanguage:  " + korealanguage;
        if(krbf)
            krdataMessage += "\nFood:  " + koreafood;
        if(krbg)
            krdataMessage += "\nGDP(Trillion $):  " + koreagdp;
        return krdataMessage;
    }

    private void displayMessage01(String message) {
        TextView KoreaTextView = (TextView) findViewById(R.id.krinfo);
        KoreaTextView.setText(message);
    }
}
