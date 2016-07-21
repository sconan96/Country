package com.example.android.country;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button02 = (Button) findViewById(R.id.button02);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }

double chinapopulation = 1382323.4;
double chinaarea = 9640.8;
String chinacapital = "Beijing";
String chinalanguage = "Chinese";
String chinafood = "huǒguō";
double chinagdp = 9.24;

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

        CheckBox chLanguageCheckBox = (CheckBox) findViewById(R.id.chlanguage_checkbox);
        boolean chlanguage = chLanguageCheckBox.isChecked();
        Log.v("MainActivity", "Language: " + chlanguage);

        CheckBox chFoodCheckBox = (CheckBox) findViewById(R.id.chfood_checkbox);
        boolean chfood = chFoodCheckBox.isChecked();
        Log.v("MainActivity", "Food: " + chfood);

        CheckBox chGdpCheckBox = (CheckBox) findViewById(R.id.chgdp_checkbox);
        boolean chgdp = chGdpCheckBox.isChecked();
        Log.v("MainActivity", "GDP: " + chgdp);

        String chdataMessage = chinformation(chpopulation, charea, chcapital, chlanguage, chfood, chgdp);
        displayMessage02(chdataMessage);

    }

    private String chinformation(boolean chbp, boolean chba, boolean chbc, boolean chbl, boolean chbf, boolean chbg) {
        String chdataMessage = "Information: \n\n";
        if(chbp)
            chdataMessage += "\nPopulation (Thousand):  " + chinapopulation;
        if(chba)
            chdataMessage += "\nArea(Thousand km2):  " + chinaarea;
        if(chbc)
            chdataMessage += "\nCapital City:  " + chinacapital;
        if(chbl)
            chdataMessage += "\nLanguage:  " + chinalanguage;
        if(chbf)
            chdataMessage += "\nFood:  " + chinafood;
        if(chbg)
            chdataMessage += "\nGDP(Trillion $):  " + chinagdp;
        return chdataMessage;
    }

    private void displayMessage02(String message) {
        TextView ChinaTextView = (TextView) findViewById(R.id.chinfo);
        ChinaTextView.setText(message);
    }
}