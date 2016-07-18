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

    double koreapopulation = 50617.1;
    double koreaarea = 100.2;
    String koreacapital = "Seoul";
    String korealanguage = "Korean";
    String koreafood = "Kimchi";
    double koreagdp = 1.31;

    double chinapopulation = 1382323.4;
    double chinaarea = 9640.8;
    String chinacapital = "Beijing";
    String chinalanguage = "Chinese";
    String chinafood = "huǒguō";
    double chinagdp = 9.24;

    double japanpopulation = 126919.7;
    double japanarea = 377.9;
    String japancapital = "Tokyo";
    String japanlanguage = "Japanese";
    String japanfood = "Sushi";
    double japangdp = 4.92;

    double usapopulation = 321368.9;
    double usaarea = 9826.7;
    String usacapital = "Washington D.C.";
    String usalanguage = "English";
    String usafood = "Steak";
    double usagdp = 16.77;

    double hongkongpopulation = 7234.8;
    double hongkongarea = 2.8;
    String hongkongcapital = "Hong Kong";
    String hongkonglanguage = "Chinese / English";
    String hongkongfood = "Dim Sum";
    double hongkonggdp = 0.28;


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
            krdataMessage += "\nCapital Language:  " + korealanguage;
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
            jpdataMessage += "\nCapital City:  " + japanlanguage;
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