package com.example.android.country;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button button05 = (Button) findViewById(R.id.button05);
        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }

    double hongkongpopulation = 7234.8;
    double hongkongarea = 2.8;
    String hongkongcapital = "Hong Kong";
    String hongkonglanguage = "Chinese / English";
    String hongkongfood = "Dim Sum";
    double hongkonggdp = 0.28;

    public void showHongkong(View view) {
        CheckBox hkPopulationCheckBox = (CheckBox) findViewById(R.id.hkpopulation_checkbox);
        boolean hkpopulation = hkPopulationCheckBox.isChecked();
        Log.v("MainActivity", "Population: " + hkpopulation);

        CheckBox hkAreaCheckBox = (CheckBox) findViewById(R.id.hkarea_checkbox);
        boolean hkarea = hkAreaCheckBox.isChecked();
        Log.v("MainActivity", "Area: " + hkarea);

        CheckBox hkCapitalCheckBox = (CheckBox) findViewById(R.id.hkcapital_checkbox);
        boolean hkcapital = hkCapitalCheckBox.isChecked();
        Log.v("MainActivity", "Capital: " + hkcapital);

        CheckBox hkLanguageCheckBox = (CheckBox) findViewById(R.id.hklanguage_checkbox);
        boolean hklanguage = hkLanguageCheckBox.isChecked();
        Log.v("MainActivity", "Language: " + hklanguage);

        CheckBox hkFoodCheckBox = (CheckBox) findViewById(R.id.hkfood_checkbox);
        boolean hkfood = hkFoodCheckBox.isChecked();
        Log.v("MainActivity", "Food: " + hkfood);

        CheckBox hkGdpCheckBox = (CheckBox) findViewById(R.id.hkgdp_checkbox);
        boolean hkgdp = hkGdpCheckBox.isChecked();
        Log.v("MainActivity", "GDP: " + hkgdp);

        String hkdataMessage = hkinformation(hkpopulation, hkarea, hkcapital, hklanguage, hkfood, hkgdp);
        displayMessage05(hkdataMessage);

    }

    private String hkinformation(boolean hkbp, boolean hkba, boolean hkbc, boolean hkbl, boolean hkbf, boolean hkbg) {
        String hkdataMessage = "Information: \n\n";
        if(hkbp)
            hkdataMessage += "\nPopulation(Thousand):  " + hongkongpopulation;
        if(hkba)
            hkdataMessage += "\nArea(Thousand km2):  " + hongkongarea;
        if(hkbc)
            hkdataMessage += "\nCapital City:  " + hongkongcapital;
        if(hkbl)
            hkdataMessage += "\nLanguage:  " + hongkonglanguage;
        if(hkbf)
            hkdataMessage += "\nFood:  " + hongkongfood;
        if(hkbg)
            hkdataMessage += "\nGDP(Trillion $):  " + hongkonggdp;
        return hkdataMessage;
    }

    private void displayMessage05(String message) {
        TextView HongkongTextView = (TextView) findViewById(R.id.hkinfo);
        HongkongTextView.setText(message);
    }
}
