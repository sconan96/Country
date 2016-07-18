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
    String koreafood = "Kimchi";
    double koreagdp = 1.31;

    int chinapopulation = 1382323332;
    int chinaarea = 9640821;
    String chinacapital = "Beijing";
    String chinafood = "huǒguō";
    double chinagdp = 9.24;

    int japanpopulation = 126919659;
    int japanarea = 377962;
    String japancapital = "Tokyo";
    String japanfood = "Sushi";
    double japangdp = 4.92;

    int usapopulation = 321368864;
    int usaarea = 9826675;
    String usacapital = "Washington D.C.";
    String usafood = "Steak";
    double usagdp = 16.77;

    int hongkongpopulation = 7234831;
    int hongkongarea = 2755;
    String hongkongcapital = "Hong Kong";
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
        String chdataMessage = "Information";
        if(chbp)
            chdataMessage += "\nPopulation:  " + chinapopulation;
        if(chba)
            chdataMessage += "\nArea(km2):  " + chinaarea;
        if(chbc)
            chdataMessage += "\nCapital City:  " + chinacapital;
        if(chbf)
            chdataMessage += "\nFood:  " + chinafood;
        if(chbg)
            chdataMessage += "\nGDP(Trillion$):  " + chinagdp;
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

        CheckBox jpFoodCheckBox = (CheckBox) findViewById(R.id.jpfood_checkbox);
        boolean jpfood = jpFoodCheckBox.isChecked();
        Log.v("MainActivity", "Food: " + jpfood);

        CheckBox jpGdpCheckBox = (CheckBox) findViewById(R.id.jpgdp_checkbox);
        boolean jpgdp = jpGdpCheckBox.isChecked();
        Log.v("MainActivity", "GDP: " + jpgdp);

        String jpdataMessage = jpinformation(jppopulation, jparea, jpcapital, jpfood, jpgdp);
        displayMessage03(jpdataMessage);

    }

    private String jpinformation(boolean jpbp, boolean jpba, boolean jpbc, boolean jpbf, boolean jpbg) {
        String jpdataMessage = "Information";
        if(jpbp)
            jpdataMessage += "\nPopulation:  " + japanpopulation;
        if(jpba)
            jpdataMessage += "\nArea(km2):  " + japanarea;
        if(jpbc)
            jpdataMessage += "\nCapital City:  " + japancapital;
        if(jpbf)
            jpdataMessage += "\nFood:  " + japanfood;
        if(jpbg)
            jpdataMessage += "\nGDP(Trillion$):  " + japangdp;
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

        CheckBox usFoodCheckBox = (CheckBox) findViewById(R.id.usfood_checkbox);
        boolean usfood = usFoodCheckBox.isChecked();
        Log.v("MainActivity", "Food: " + usfood);

        CheckBox usGdpCheckBox = (CheckBox) findViewById(R.id.usgdp_checkbox);
        boolean usgdp = usGdpCheckBox.isChecked();
        Log.v("MainActivity", "GDP: " + usgdp);

        String usdataMessage = usinformation(uspopulation, usarea, uscapital, usfood, usgdp);
        displayMessage04(usdataMessage);

    }

    private String usinformation(boolean usbp, boolean usba, boolean usbc, boolean usbf, boolean usbg) {
        String usdataMessage = "Information";
        if(usbp)
            usdataMessage += "\nPopulation:  " + usapopulation;
        if(usba)
            usdataMessage += "\nArea(km2):  " + usaarea;
        if(usbc)
            usdataMessage += "\nCapital City:  " + usacapital;
        if(usbf)
            usdataMessage += "\nFood:  " + usafood;
        if(usbg)
            usdataMessage += "\nGDP(Trillion$):  " + usagdp;
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

        CheckBox hkFoodCheckBox = (CheckBox) findViewById(R.id.hkfood_checkbox);
        boolean hkfood = hkFoodCheckBox.isChecked();
        Log.v("MainActivity", "Food: " + hkfood);

        CheckBox hkGdpCheckBox = (CheckBox) findViewById(R.id.hkgdp_checkbox);
        boolean hkgdp = hkGdpCheckBox.isChecked();
        Log.v("MainActivity", "GDP: " + hkgdp);

        String hkdataMessage = hkinformation(hkpopulation, hkarea, hkcapital, hkfood, hkgdp);
        displayMessage05(hkdataMessage);

    }

    private String hkinformation(boolean hkbp, boolean hkba, boolean hkbc, boolean hkbf, boolean hkbg) {
        String hkdataMessage = "Information";
        if(hkbp)
            hkdataMessage += "\nPopulation:  " + hongkongpopulation;
        if(hkba)
            hkdataMessage += "\nArea(km2):  " + hongkongarea;
        if(hkbc)
            hkdataMessage += "\nCapital City:  " + hongkongcapital;
        if(hkbf)
            hkdataMessage += "\nFood:  " + hongkongfood;
        if(hkbg)
            hkdataMessage += "\nGDP(Trillion$):  " + hongkonggdp;
        return hkdataMessage;
    }

    private void displayMessage05(String message) {
        TextView HongkongTextView = (TextView) findViewById(R.id.hkinfo);
        HongkongTextView.setText(message);
    }

}