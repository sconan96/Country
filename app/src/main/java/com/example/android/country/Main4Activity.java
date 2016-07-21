package com.example.android.country;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button button04 = (Button) findViewById(R.id.button04);
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }

    double usapopulation = 321368.9;
    double usaarea = 9826.7;
    String usacapital = "Washington D.C.";
    String usalanguage = "English";
    String usafood = "Steak";
    double usagdp = 16.77;

    public void showUsa(View view) {
        CheckBox usPopulationCheckBox = (CheckBox) findViewById(R.id.uspopulation_checkbox);
        boolean uspopulation = usPopulationCheckBox.isChecked();
        Log.v("MainActivity", "Population: " + uspopulation);

        CheckBox usAreaCheckBox = (CheckBox) findViewById(R.id.usarea_checkbox);
        boolean usarea = usAreaCheckBox.isChecked();
        Log.v("MainActivity", "Area: " + usarea);

        CheckBox usCapitalCheckBox = (CheckBox) findViewById(R.id.uscapital_checkbox);
        boolean uscapital = usCapitalCheckBox.isChecked();
        Log.v("MainActivity", "Capital: " + uscapital);

        CheckBox usLanguageCheckBox = (CheckBox) findViewById(R.id.uslanguage_checkbox);
        boolean uslanguage = usLanguageCheckBox.isChecked();
        Log.v("MainActivity", "Language: " + uslanguage);

        CheckBox usFoodCheckBox = (CheckBox) findViewById(R.id.usfood_checkbox);
        boolean usfood = usFoodCheckBox.isChecked();
        Log.v("MainActivity", "Food: " + usfood);

        CheckBox usGdpCheckBox = (CheckBox) findViewById(R.id.usgdp_checkbox);
        boolean usgdp = usGdpCheckBox.isChecked();
        Log.v("MainActivity", "GDP: " + usgdp);

        String usdataMessage = usinformation(uspopulation, usarea, uscapital, uslanguage, usfood, usgdp);
        displayMessage04(usdataMessage);

    }

    private String usinformation(boolean usbp, boolean usba, boolean usbc, boolean usbl, boolean usbf, boolean usbg) {
        String usdataMessage = "Information:\n\n";
        if(usbp)
            usdataMessage += "\nPopulation(Thousand):  " + usapopulation;
        if(usba)
            usdataMessage += "\nArea(Thousand km2):  " + usaarea;
        if(usbc)
            usdataMessage += "\nCapital City:  " + usacapital;
        if(usbl)
            usdataMessage += "\nLanguage:  " + usalanguage;
        if(usbf)
            usdataMessage += "\nFood:  " + usafood;
        if(usbg)
            usdataMessage += "\nGDP(Trillion $):  " + usagdp;
        return usdataMessage;
    }

    private void displayMessage04(String message) {
        TextView UsaTextView = (TextView) findViewById(R.id.usinfo);
        UsaTextView.setText(message);
    }
}
