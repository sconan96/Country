package com.example.android.country;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button03 = (Button) findViewById(R.id.button03);
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }

    double japanpopulation = 126919.7;
    double japanarea = 377.9;
    String japancapital = "Tokyo";
    String japanlanguage = "Japanese";
    String japanfood = "Sushi";
    double japangdp = 4.92;

    public void showJapan(View view) {
        CheckBox jpPopulationCheckBox = (CheckBox) findViewById(R.id.jppopulation_checkbox);
        boolean jppopulation = jpPopulationCheckBox.isChecked();
        Log.v("MainActivity", "Population: " + jppopulation);

        CheckBox jpAreaCheckBox = (CheckBox) findViewById(R.id.jparea_checkbox);
        boolean jparea = jpAreaCheckBox.isChecked();
        Log.v("MainActivity", "Area: " + jparea);

        CheckBox jpCapitalCheckBox = (CheckBox) findViewById(R.id.jpcapital_checkbox);
        boolean jpcapital = jpCapitalCheckBox.isChecked();
        Log.v("MainActivity", "Capital: " + jpcapital);

        CheckBox jpLanguageCheckBox = (CheckBox) findViewById(R.id.jplanguage_checkbox);
        boolean jplanguage = jpLanguageCheckBox.isChecked();
        Log.v("MainActivity", "Language: " + jplanguage);

        CheckBox jpFoodCheckBox = (CheckBox) findViewById(R.id.jpfood_checkbox);
        boolean jpfood = jpFoodCheckBox.isChecked();
        Log.v("MainActivity", "Food: " + jpfood);

        CheckBox jpGdpCheckBox = (CheckBox) findViewById(R.id.jpgdp_checkbox);
        boolean jpgdp = jpGdpCheckBox.isChecked();
        Log.v("MainActivity", "GDP: " + jpgdp);

        String jpdataMessage = jpinformation(jppopulation, jparea, jpcapital, jplanguage, jpfood, jpgdp);
        displayMessage03(jpdataMessage);

    }

    private String jpinformation(boolean jpbp, boolean jpba, boolean jpbc, boolean jpbl, boolean jpbf, boolean jpbg) {
        String jpdataMessage = "Information: \n\n";
        if(jpbp)
            jpdataMessage += "\nPopulation(Thousand):  " + japanpopulation;
        if(jpba)
            jpdataMessage += "\nArea(Thousand km2):  " + japanarea;
        if(jpbc)
            jpdataMessage += "\nCapital City:  " + japancapital;
        if(jpbl)
            jpdataMessage += "\nLanguage:  " + japanlanguage;
        if(jpbf)
            jpdataMessage += "\nFood:  " + japanfood;
        if(jpbg)
            jpdataMessage += "\nGDP(Trillion $):  " + japangdp;
        return jpdataMessage;
    }

    private void displayMessage03(String message) {
        TextView JapanTextView = (TextView) findViewById(R.id.jpinfo);
        JapanTextView.setText(message);
    }
}
